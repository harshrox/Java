package com.gamingz.OOP.OOP2;

public class Bird extends Animals {

    public Bird(String name, String color, int legs, boolean hasTail) {
        super(name, color, legs, hasTail);
    }

    public void fly(){
        System.out.println(this.getName()+" is flying");
    }

    @Override
    public void eat(String food) {
        super.eat(food);  // eating
        System.out.println(this.getName()+" is chewing "+food); //chewing
    }
}
