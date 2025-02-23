package ChainOfResponsibilityDesignPattern.v1.Processor;

public class InfoLogProcessor extends LogProcessor{ 
    public InfoLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }
    
    @Override
    public void log(int logLevel, String message){
        if(logLevel == INFO){
            System.out.println("INFO: " + message);
        }else{
            super.log(logLevel, message);
        }
    }
}
