package com.dakshay;

public class FanIncreaseCommand implements Command{
    private final Fan fan;
    private int prevSpeed;

    public FanIncreaseCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        this.prevSpeed = fan.getSpeed();
        fan.increaseSpeed();
    }

    @Override
    public void undo() {
        fan.undo(prevSpeed);
    }
}
