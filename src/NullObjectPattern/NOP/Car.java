package NullObjectPattern.NOP;

public class Car implements Vehicle {

    @Override
    public int getTankCapacity(){
        return 20;
    }
    
    @Override
    public int getSeatingCapacity(){
        return 5;
    }
}
