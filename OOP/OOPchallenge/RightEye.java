package com.gamingz.OOP.OOPchallenge;

public class RightEye extends LeftEye{

    public RightEye(String name, String medCon, String color) {
        super(name, medCon, color);
    }

    @Override
    public void closeEye() {
        System.out.println("Right Eye Closed");
    }
}
