package com.gamingz.OOP.OOP1;

public class Phone {

    //public String name;
    private String name;
    int RAM;
    int camera;





    public Phone(String name, int RAM, int camera){   // Constructor 1 for moto
        this.name = name;
        this.RAM = RAM;
        this.camera = camera;
    }

    public Phone(String name, int RAM) {  // Constructor 2 for pixel
        this.name = name;
        this.RAM = RAM;
    }

    public void setName(String name) {
        this.name = name; // "this" refers to the current object instance on which the method is being called.
    }


    public String getName() {
        return this.name;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public void playMusic(String trackName) {    // defining method
        System.out.println("Playing "+trackName);
    }
}

