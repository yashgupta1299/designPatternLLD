package DecoratorPattern.Decorator;

import DecoratorPattern.Component.Pizza;

public abstract class PizzaDecorator implements Pizza{
    protected Pizza decoratedPizza;
    public PizzaDecorator(Pizza decoratedPizza){
        this.decoratedPizza = decoratedPizza;
    }

    @Override
    public String getDescription(){
        return decoratedPizza.getDescription();
    }

    @Override
    public int cost(){
        return decoratedPizza.cost();
    }
}
