package loggers;

import org.apache.log4j.Logger;

public class TestLogger {
    public TestLogger() {
        super();
    }
    
    
    private static MyLog4jLoggerMain mainLog = new MyLog4jLoggerMain(TestLogger.class);
    private static MyLog4jLogger mylog = new MyLog4jLogger(TestLogger.class);

    public static void main(String[] args) {
        
        
        TestLogger test = new TestLogger();
        test.mylog.info("bbbbbbbbbbbbbbbbbbb");
        test.mainLog.info("aaaaaaaaaaaaaaaa");

        System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");


    }
}
