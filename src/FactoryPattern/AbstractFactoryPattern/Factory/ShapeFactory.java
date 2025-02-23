package FactoryPattern.AbstractFactoryPattern.Factory;

import FactoryPattern.AbstractFactoryPattern.Shape.Rectangle;
import FactoryPattern.AbstractFactoryPattern.Shape.Shape;
import FactoryPattern.AbstractFactoryPattern.Shape.Square;

public class ShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shapeType){	
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        } 
        return null;
    }
}