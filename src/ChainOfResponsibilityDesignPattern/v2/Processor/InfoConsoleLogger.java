package ChainOfResponsibilityDesignPattern.v2.Processor;

public class InfoConsoleLogger extends AbstractLogger {

   public InfoConsoleLogger() {
      this.level = AbstractLogger.INFO;
   }

   @Override
   protected void write(String message) {
      System.out.println("InfoConsoleLogger: Standard Console::Logger: " + message);
   }
}