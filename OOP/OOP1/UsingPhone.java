package com.gamingz.OOP.OOP1;

public class UsingPhone {
    public static void main(String[] args) {
        Phone moto = new Phone("moto g60",6,108);

        /*
        moto.name = "moto g60";
        moto.setName("moto g60");
        moto.RAM = 6;
        moto.camera = 108;

        System.out.println("Launching new motorola phone "+moto.name);
        */

        System.out.println("Launching new motorola phone "+moto.getName());
        System.out.println("It has an impressive camera of "+moto.camera+" MP");
        System.out.println("With a powerful RAM of "+moto.RAM+" GB");

        moto.playMusic("Never Enough");

        System.out.println("\n");


        Phone pixel = new Phone("pixel 6a",8);
        pixel.setCamera(150);
        pixel.setName("pixel 7a");
        System.out.println("Launching new Google phone "+pixel.getName());
        System.out.println("It has an impressive camera of "+pixel.getCamera()+" MP");
        System.out.println("With a powerful RAM of "+pixel.RAM+" GB");



    }
}
