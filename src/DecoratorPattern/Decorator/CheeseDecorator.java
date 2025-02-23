package DecoratorPattern.Decorator;

import DecoratorPattern.Component.Pizza;

public class CheeseDecorator extends PizzaDecorator{
    public CheeseDecorator(Pizza decoratedPizza){
        super(decoratedPizza);
    }

    @Override
    public String getDescription(){
        return decoratedPizza.getDescription() + ", Cheese";
    }

    @Override
    public int cost(){
        return decoratedPizza.cost() + 2;
    }
}
