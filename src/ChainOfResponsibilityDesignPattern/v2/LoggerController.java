package ChainOfResponsibilityDesignPattern.v2;

import ChainOfResponsibilityDesignPattern.v2.Processor.AbstractLogger;
import ChainOfResponsibilityDesignPattern.v2.Processor.DebugFileLogger;
import ChainOfResponsibilityDesignPattern.v2.Processor.ErrorLogger;
import ChainOfResponsibilityDesignPattern.v2.Processor.InfoConsoleLogger;

public class LoggerController{
    public static AbstractLogger getChainOfLoggers() {
        AbstractLogger errorLogger = new ErrorLogger();
        AbstractLogger fileLogger = new DebugFileLogger();
        AbstractLogger consoleLogger = new InfoConsoleLogger();
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }
}
