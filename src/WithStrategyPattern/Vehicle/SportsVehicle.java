package WithStrategyPattern.Vehicle;

import WithStrategyPattern.Strategy.SportsDriveCapability;

public class SportsVehicle extends Vehicle {
    public SportsVehicle(){
        super(new SportsDriveCapability());
    }
    
}