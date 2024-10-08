package com.dakshay;

public class RemoteLoader {


    public static void main(String[] args) {

        Light light = new Light();
        Fan fan = new Fan();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        FanOffCommand fanOffCommand = new FanOffCommand(fan);
        FanIncreaseCommand fanIncreaseCommand = new FanIncreaseCommand(fan);
        lightOnCommand.execute();
        lightOnCommand.undo();
        fanTest(fanOffCommand, fan, fanIncreaseCommand);
        RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();
        remoteControlWithUndo.setCommands(0, lightOnCommand, lightOffCommand);
        remoteControlWithUndo.setCommands(1, fanIncreaseCommand, fanOffCommand);
        remoteControlWithUndo.onButtonPushed(1);
        remoteControlWithUndo.offButtonPushed(1);


    }

    private static void fanTest(FanOffCommand fanOffCommand, Fan fan, FanIncreaseCommand fanIncreaseCommand) {
        fanOffCommand.execute();
        System.out.println("Fan Speed " + fan.getSpeed());
        fanIncreaseCommand.execute();
        System.out.println("Fan Speed " + fan.getSpeed());
        fanIncreaseCommand.execute();
        System.out.println("Fan Speed " + fan.getSpeed());
        fanOffCommand.execute();
        System.out.println("Fan Speed " + fan.getSpeed());
        fanOffCommand.undo();
        System.out.println("Fan Speed " + fan.getSpeed());
    }
}
