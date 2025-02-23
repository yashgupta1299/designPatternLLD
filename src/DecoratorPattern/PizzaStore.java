package DecoratorPattern;

import DecoratorPattern.Component.*;
import DecoratorPattern.Decorator.*;;

public class PizzaStore {
    public static void main(String []args){
        // Pizza pizza = new PlainPizza();
        // pizza.printInfo();
        
        // pizza = new CheeseDecorator(pizza); 
        // pizza.printInfo();

        // pizza = new MushroomDecorator(pizza); 
        // pizza.printInfo();       

        // pizza = new PepperoniDecorator(pizza); 
        // pizza.printInfo();       


        Pizza pizza = new PepperoniDecorator(new MushroomDecorator(new CheeseDecorator(new SpecialPizza()))); 
        pizza.printInfo();
    }
}