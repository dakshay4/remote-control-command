package com.dakshay;

public class FanOffCommand implements Command{
    private final Fan fan;
    private int prevSpeed;

    public FanOffCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        prevSpeed = fan.getSpeed();
        fan.off();
    }

    @Override
    public void undo() {
        fan.undo(prevSpeed);
    }
}
