package ChainOfResponsibilityDesignPattern.v2.Processor;

public class DebugFileLogger extends AbstractLogger {

   public DebugFileLogger() {
      this.level = AbstractLogger.DEBUG;
   }

   @Override
   protected void write(String message) {
      System.out.println("DebugFileLogger: File::Logger: " + message);
   }
}
