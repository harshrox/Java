package com.gamingz.OOP.OOPchallenge;

public class LeftEye extends Organ{

    private String color;

    public LeftEye(String name, String medCon, String color) {
        super(name, medCon);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void closeEye(){
        System.out.println("Left Eye Closed");
    }
}
