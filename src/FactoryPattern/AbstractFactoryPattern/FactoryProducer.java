package FactoryPattern.AbstractFactoryPattern;

import FactoryPattern.AbstractFactoryPattern.Factory.AbstractFactory;
import FactoryPattern.AbstractFactoryPattern.Factory.RoundedShapeFactory;
import FactoryPattern.AbstractFactoryPattern.Factory.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean rounded){
        if(rounded){
            return new RoundedShapeFactory();
        }else{
            return new ShapeFactory();
        }
    }
}
