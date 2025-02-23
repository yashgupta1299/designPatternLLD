package DecoratorPattern.Component;

public class SpecialPizza implements Pizza{
    public String getDescription(){
        return "Special Pizza";
    }
    public int cost(){
        return 100;
    }
}
