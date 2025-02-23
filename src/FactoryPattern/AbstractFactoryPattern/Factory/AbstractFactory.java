package FactoryPattern.AbstractFactoryPattern.Factory;

import FactoryPattern.AbstractFactoryPattern.Shape.Shape;

public abstract class AbstractFactory {
    public abstract Shape getShape(String shapeType) ;
}
