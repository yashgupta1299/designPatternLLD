package WithStrategyPattern.Vehicle;

import WithStrategyPattern.Strategy.NormalDrive;

public class GoodsVehicle extends Vehicle{
    public GoodsVehicle(){
        super(new NormalDrive());
    }
}
