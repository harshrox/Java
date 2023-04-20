package com.gamingz.OOP.OOP2;

public class Main {
    public static void main(String[] args) {
        Bird eagle = new Bird("Golden Eagle","Dark brown",2,true);

        Dog bulldog = new Dog("French Bulldog","Yellow",4,true);

        bulldog.setHasFur(true);

        eagle.fly();

        eagle.eat("meat"); //eating +chewing


    }
}
