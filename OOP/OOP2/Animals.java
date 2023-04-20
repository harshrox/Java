package com.gamingz.OOP.OOP2;

public class Animals {
    String name;
    String color;
    int legs;
    boolean hasTail;

    public Animals(String name, String color, int legs, boolean hasTail) {
        this.name = name;
        this.color = color;
        this.legs = legs;
        this.hasTail = hasTail;
    }

    public void eat(String food){
        System.out.println(this.getName()+" is eating "+food);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }
}
