package WithStrategyPattern;

import java.util.ArrayList;
import java.util.List;

import WithStrategyPattern.Vehicle.GoodsVehicle;
import WithStrategyPattern.Vehicle.OffroadVehicle;
import WithStrategyPattern.Vehicle.SportsVehicle;
import WithStrategyPattern.Vehicle.Vehicle;

public class Main {
    public static void main(String args[]){
        System.out.println("Hello World");
        List<Vehicle> arr = new ArrayList<>();
        arr.add(new OffroadVehicle());
        arr.add(new SportsVehicle());
        arr.add(new GoodsVehicle());

        for(Vehicle v:arr){
            v.drive();
        }
    }
}