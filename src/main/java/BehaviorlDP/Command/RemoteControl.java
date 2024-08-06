package BehaviorlDP.Command;

public class RemoteControl {
    private Command command;

    public void pressButton(){
        command.execute();
    }

    public Command GetCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
