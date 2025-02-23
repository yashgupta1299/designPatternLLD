package DecoratorPattern.Component;

public class PlainPizza implements Pizza{
    public String getDescription(){
        return "Plain Pizza";
    }
    public int cost(){
        return 50;
    }
}
