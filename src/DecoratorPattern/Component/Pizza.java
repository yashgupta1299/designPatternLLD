package DecoratorPattern.Component;

public interface Pizza {
    String getDescription();
    int cost();
    default void printInfo(){
        System.out.println(this.getDescription() + " $" + this.cost());
    }
}