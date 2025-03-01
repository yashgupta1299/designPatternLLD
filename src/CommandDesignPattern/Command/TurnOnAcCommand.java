package CommandDesignPattern.Command;

import CommandDesignPattern.AirConditioner;

public class TurnOnAcCommand implements ICommand{
    AirConditioner ac;
    public TurnOnAcCommand(AirConditioner ac){
        this.ac = ac;
    }

    @Override
    public void execute(){
        this.ac.turnOnAc();
    }

    @Override
    public void undo(){
        this.ac.turnOfAc();
    }
}
