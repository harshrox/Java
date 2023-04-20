package com.gamingz.OOP.OOP3;

public class Main {

    public static void main(String[] args) {
        //Engine engine = new Engine("Renault",8000);
        //Car mercedes = new Car("Mercedes AMG",2,"Black",engine);

        Car mercedes = new Car("Mercedes AMG",2,"Black", new Engine("Renault",8000));

        System.out.println(mercedes.getName());
        System.out.println("Engine: "+mercedes.getEngine().getModel());

        System.out.println("");

        //to get engine object directly
        Engine engine = mercedes.getEngine();
        System.out.println(mercedes.getName());
        System.out.println("Engine: "+engine.getModel());
    }


}
