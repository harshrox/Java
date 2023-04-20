package com.gamingz.OOP.OOP2;

public class Dog extends Animals{
    boolean hasFur;
    public Dog(String name, String color, int legs, boolean hasTail) {
        super(name, color, legs, hasTail);

    }

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }
}
