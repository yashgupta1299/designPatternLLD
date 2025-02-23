package DecoratorPattern.Decorator;

import DecoratorPattern.Component.Pizza;

public class MushroomDecorator extends PizzaDecorator{
    public MushroomDecorator(Pizza decoratedPizza){
        super(decoratedPizza);
    }

    @Override
    public String getDescription(){
        return decoratedPizza.getDescription() + ", Mushroom";
    }

    @Override
    public int cost(){
        return decoratedPizza.cost() + 3;
    }
}
