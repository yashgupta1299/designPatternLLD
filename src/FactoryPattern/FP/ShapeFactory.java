package FactoryPattern.FP;

import FactoryPattern.FP.Shape.Circle;
import FactoryPattern.FP.Shape.Rectangle;
import FactoryPattern.FP.Shape.Shape;
import FactoryPattern.FP.Shape.Square;

public class ShapeFactory {

    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        } 
        return null;
    }
}