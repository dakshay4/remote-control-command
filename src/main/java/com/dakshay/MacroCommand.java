package com.dakshay;

public class MacroCommand implements Command{

    private final Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for(Command command : commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {

    }
}
