package CommandDesignPattern.Command;

import CommandDesignPattern.AirConditioner;

public class TurnOfAcCommand implements ICommand{
    AirConditioner ac;
    public TurnOfAcCommand(AirConditioner ac){
        this.ac = ac;
    }

    @Override
    public void execute(){
        this.ac.turnOfAc();
    }

    @Override
    public void undo(){
        this.ac.turnOnAc();
    }
}
