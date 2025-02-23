package ChainOfResponsibilityDesignPattern.v1.Processor;

public abstract class LogProcessor {
    LogProcessor nextLogProcessor;
    public static int ERROR = 1; 
    public static int INFO = 2; 
    public static int DEBUG = 3;
    
    public LogProcessor(LogProcessor nextLogProcessor){
        this.nextLogProcessor = nextLogProcessor;
    }

    public void log(int logLevel, String message){
        if(nextLogProcessor!=null){
            nextLogProcessor.log(logLevel, message);
        }else{
            System.out.println("NO CHAIN");
        }
    }
}
