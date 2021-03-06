package loggers;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.MDC;

public class MyLog4jLoggerMain {
    static{
        Log4jPropertiesLoader ll = new Log4jPropertiesLoader();
        ll.initializeLog4j();
    }
    public MyLog4jLoggerMain() {
        super();
        log4jLogger = Logger.getRootLogger();
    }

    /**
     * Constructor with Class as parameter
     * @param loggerClass
     */
    public MyLog4jLoggerMain(Class loggerClass) {
         log4jLogger = Logger.getLogger(loggerClass);
       
    }


    /**
     * @Deprecated
     * Constructor with String as paramter
     * @param className - full path of the className
     */
    public MyLog4jLoggerMain(String className) {
        log4jLogger = Logger.getLogger(className);
    }
    private Logger log4jLogger;

    public static void main(String[] args) {
    }

    /**
     * Checks if Info level is enabled and logs msg
     * @param msg
     */
    public void info(String msg) {
        logInfo(msg);
    }

    /**
     * Logs msg in Info level
     * @param msg
     */
    private void logInfo(String msg) {
        log4jLogger.info(msg);
    }
}
