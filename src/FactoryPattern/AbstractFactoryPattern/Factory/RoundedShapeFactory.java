package FactoryPattern.AbstractFactoryPattern.Factory;

import FactoryPattern.AbstractFactoryPattern.Shape.RoundedRectangle;
import FactoryPattern.AbstractFactoryPattern.Shape.Shape;
import FactoryPattern.AbstractFactoryPattern.Shape.RoundedSquare;

public class RoundedShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shapeType){	
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new RoundedRectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new RoundedSquare();
        } 
        return null;
    }
}