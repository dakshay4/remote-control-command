package com.dakshay;

public class Fan {

    private final Speed[] speeds = new Speed[]{Speed.OFF, Speed.LOW,Speed.MED,Speed.HIGH,Speed.BOOST};
    private int speed = 0;


    public void increaseSpeed() {
        if(speed >=speeds.length-1) {
            System.out.println("Speed Cannot Exceed Limit");
            return;
        }
        this.speed = speed+1;
        System.out.println("Increasing Speed");
    }

    public void off(){
        System.out.println("Increasing Speed");
        this.speed = 0;
    }

    public int getSpeed(){
        return speed;
    }

    public void undo(int prevSpeed) {
        this.speed = prevSpeed;
    }

    public enum Speed {
        OFF,LOW,MED,HIGH,BOOST

    }


}
