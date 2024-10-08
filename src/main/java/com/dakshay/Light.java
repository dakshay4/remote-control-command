package com.dakshay;

public class Light {

    private boolean on;


    public void on() {
        System.out.println("Turning Light on");
        this.on = true;
    }
    public void off() {
        System.out.println("Turning Light Off");
        this.on = false;
    }

}
