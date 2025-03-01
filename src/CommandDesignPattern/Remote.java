package CommandDesignPattern;

import java.util.Stack;

import CommandDesignPattern.Command.ICommand;

public class Remote {
    Stack<ICommand> acCommandHistory = new Stack<>();
    ICommand iCommand;
    public Remote(){

    }

    public void setCommand(ICommand iCommand){
        this.iCommand = iCommand;
    }
    public void pressButton(){
        this.iCommand.execute();
        acCommandHistory.add(iCommand);
    }
    public void undo(){
        while (!acCommandHistory.empty()) {
            ICommand lastCommand = acCommandHistory.pop();
            lastCommand.undo();
        }
    }
}
