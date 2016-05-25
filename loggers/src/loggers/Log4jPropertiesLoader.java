package loggers;

import java.util.StringTokenizer;

import org.apache.commons.logging.LogFactory;
import org.apache.log4j.PropertyConfigurator;

public class Log4jPropertiesLoader {
    private static final String LOG4J_CONFIG_FILE_NAME = "log4j.properties";

    public Log4jPropertiesLoader() {
        super();
    }

    public void initializeLog4j() {
        try {
            // Find the log4j configuration properties file path
            String propertyFilePath = getFilePath();
            if (propertyFilePath != null) {
                // Use property configurator to initialize log4j
                PropertyConfigurator.configureAndWatch(propertyFilePath,
                                                       300000);
                LogFactory.getLog(Log4jPropertiesLoader.class).info("\n Log4j properties initialized ");
            }
        } catch (Throwable thr) {
            thr.printStackTrace();
        }
    }

    private String getFilePath() throws java.io.IOException {
        String filePath = null;
        String path = System.getProperty("java.class.path");
        String pathSeparator = System.getProperty("path.separator");

        StringTokenizer st = new StringTokenizer(path, pathSeparator);
        while (st.hasMoreTokens()) {
            filePath = st.nextToken();
            if (filePath.indexOf(LOG4J_CONFIG_FILE_NAME) != -1) {
                return filePath;
            } else
                return "C:\\JDeveloper\\mywork\\JavaApplication\\loggers\\src\\loggers\\log4j.properties";
        }
        return null;
    }
}
