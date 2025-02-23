package DecoratorPattern.Decorator;

import DecoratorPattern.Component.Pizza;

public class PepperoniDecorator extends PizzaDecorator{
    public PepperoniDecorator(Pizza decoratedPizza){
        super(decoratedPizza);
    }

    @Override
    public String getDescription(){
        return decoratedPizza.getDescription() + ", Pepperoni";
    }

    @Override
    public int cost(){
        return decoratedPizza.cost() + 4;
    }
}
