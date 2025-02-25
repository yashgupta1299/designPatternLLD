package FlyweightDesignPattern.v2;

import FlyweightDesignPattern.v2.robot.IRobot;

public class Main {

    public static void main(String args[]){

        IRobot humanoidRobot1 = RoboticFactory.createRobot("HUMANOID");
        humanoidRobot1.display(1,2);


        IRobot humanoidRobot2 = RoboticFactory.createRobot("ROBOTICDOG");
        humanoidRobot2.display(10,30);

        IRobot roboDog1 = RoboticFactory.createRobot("HUMANOID");
        roboDog1.display(2,9);

        IRobot roboDog2 = RoboticFactory.createRobot("ROBOTICDOG");
        roboDog2.display(11,19);

    }
}
