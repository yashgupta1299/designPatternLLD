package NullObjectPattern;

import NullObjectPattern.NOP.Vehicle;

public class Main {
    private static void printVehicleDetails(Vehicle vehicle){
        System.out.println("Seating Capacity: " + vehicle.getSeatingCapacity());
        System.out.println("Tank Capacity: " + vehicle.getTankCapacity());
    }
    public static void main(String []args){
        // Vehicle vehicle = VehicleFactory.getVehicleObject("Car");
        Vehicle vehicle = VehicleFactory.getVehicleObject("Bike");
        printVehicleDetails(vehicle);
    }

}
