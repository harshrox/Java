package com.gamingz.OOP.OOPchallenge;

public class Stomach extends Organ{

    public Stomach(String name, String medCon) {
        super(name, medCon);
    }

    public void digest(){
        System.out.println("Digestion begins...");
    }
}
