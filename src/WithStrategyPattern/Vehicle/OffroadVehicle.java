package WithStrategyPattern.Vehicle;

import WithStrategyPattern.Strategy.SportsDriveCapability;

public class OffroadVehicle extends Vehicle {
    public OffroadVehicle(){
        super(new SportsDriveCapability());
    }
    
}