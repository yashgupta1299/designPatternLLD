package BridgePattern;
import BridgePattern.Draw.*;
import BridgePattern.Shape.Circle;
import BridgePattern.Shape.Shape;

public class BridgePatternDemo {
    public static void main(String[] args) {
       Shape redCircle = new Circle(100,100, 10, new RedCircle());
       Shape greenCircle = new Circle(100,100, 10, new GreenCircle());
 
       redCircle.draw();
       greenCircle.draw();
    }
 }