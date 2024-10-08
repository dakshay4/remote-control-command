package com.dakshay;

public class RemoteControlWithUndo {

    private final Command[] onCommands;
    private final Command[] offCommands;
    private  Command undoCommand;

    public RemoteControlWithUndo() {
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];
        NoCommand noCommand = new NoCommand();
        for(int i=0;i<7;i++) {
            this.onCommands[i] = noCommand;
            this.offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommands(int slot, Command onCommand, Command offCommand) {
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    public void onButtonPushed(int slot){
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }
    public void offButtonPushed(int slot){
        offCommands[slot].execute();
        undoCommand = onCommands[slot];
    }
    public void undoButtonPushed() {
        undoCommand.undo();
    }
}
