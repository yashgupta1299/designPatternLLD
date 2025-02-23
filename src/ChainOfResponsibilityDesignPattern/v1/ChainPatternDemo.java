package ChainOfResponsibilityDesignPattern.v1;

import ChainOfResponsibilityDesignPattern.v1.Processor.DebugLogProcessor;
import ChainOfResponsibilityDesignPattern.v1.Processor.ErrorLogProcessor;
import ChainOfResponsibilityDesignPattern.v1.Processor.InfoLogProcessor;
import ChainOfResponsibilityDesignPattern.v1.Processor.LogProcessor;

public class ChainPatternDemo {

    public static void main(String []args){
        LogProcessor logProcessor = new ErrorLogProcessor(new DebugLogProcessor(new InfoLogProcessor(null)));

        logProcessor.log(LogProcessor.DEBUG, "DEBUG SIGNAL");
        logProcessor.log(LogProcessor.INFO, "INFO SIGNAL");
        logProcessor.log(LogProcessor.ERROR, "ERROR SIGNAL");
        logProcessor.log(4, "ERROR SIGNAL");
    }
}