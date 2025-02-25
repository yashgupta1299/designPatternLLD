package BridgePattern.Shape;
import BridgePattern.Draw.DrawAPI;

public abstract class Shape {
    protected DrawAPI drawAPI;
    
    protected Shape(DrawAPI drawAPI){
       this.drawAPI = drawAPI;
    }
    public abstract void draw();	
 }