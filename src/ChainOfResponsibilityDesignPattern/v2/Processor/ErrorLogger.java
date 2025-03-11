package ChainOfResponsibilityDesignPattern.v2.Processor;

public class ErrorLogger extends AbstractLogger {

   public ErrorLogger() {
      this.level = AbstractLogger.ERROR;
   }

   @Override
   protected void write(String message) {
      System.out.println("ErrorLogger: Error Console::Logger: " + message);
   }
}