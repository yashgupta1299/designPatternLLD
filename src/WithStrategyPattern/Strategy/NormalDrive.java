package WithStrategyPattern.Strategy;

public class NormalDrive implements DriveStrategy{
    @Override
    public void drive(){
        System.out.println("Normal Drive Capability");
    }    
}
