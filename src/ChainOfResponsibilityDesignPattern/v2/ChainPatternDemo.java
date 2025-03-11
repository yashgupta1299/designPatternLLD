package ChainOfResponsibilityDesignPattern.v2;
import ChainOfResponsibilityDesignPattern.v2.Processor.*;

public class ChainPatternDemo {
      public static void main(String[] args) {
            AbstractLogger loggerChain = LoggerController.getChainOfLoggers();
            // ERROR = 3;
            // DEBUG = 2;
            // INFO = 1;
            // ERROR > DEBUG > INFO
            System.out.println("##############################");

            loggerChain.logMessage(AbstractLogger.INFO,
                        "This is an information.");

            System.out.println("##############################");

            loggerChain.logMessage(AbstractLogger.DEBUG,
                        "This is an debug level information.");

            System.out.println("##############################");

            loggerChain.logMessage(AbstractLogger.ERROR,
                        "This is an error information.");
      }
}
