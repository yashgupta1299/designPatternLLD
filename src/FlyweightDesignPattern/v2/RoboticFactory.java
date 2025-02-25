package FlyweightDesignPattern.v2;

import java.util.HashMap;
import java.util.Map;

import FlyweightDesignPattern.v2.robot.HumanoidRobot;
import FlyweightDesignPattern.v2.robot.IRobot;
import FlyweightDesignPattern.v2.robot.RoboticDog;

public class RoboticFactory {

    private static Map<String, IRobot> roboticObjectCache = new HashMap<>();

    public static IRobot createRobot(String robotType){

        if(roboticObjectCache.containsKey(robotType)){
            return roboticObjectCache.get(robotType);
        }
        else {
            if(robotType == "HUMANOID"){
                Sprites humanoidSprite = new Sprites();
                IRobot humanoidObject = new HumanoidRobot(robotType, humanoidSprite);
                roboticObjectCache.put(robotType, humanoidObject);
                System.out.println("HUMANOID Created");
                return humanoidObject;
            }
            else if(robotType == "ROBOTICDOG"){
                Sprites roboticDogSprite = new Sprites();
                IRobot roboticDogObject = new RoboticDog(robotType, roboticDogSprite);
                roboticObjectCache.put(robotType, roboticDogObject);
                System.out.println("ROBOTICDOG Created");
                return roboticDogObject;
            }
        }
        return null;
    }
}
