package CommandDesignPattern;

import CommandDesignPattern.Command.TurnOnAcCommand;

public class Main {
    public static void main(String[] args) {
        // ac object
        AirConditioner airConditioner = new AirConditioner();
        //remote
        Remote remote = new Remote();

        // create command and press button
        remote.setCommand(new TurnOnAcCommand(airConditioner));
        remote.pressButton();

        // undo
        remote.undo();
    }
}
