package com.gamingz.OOP.OOPchallenge;

public class Organ {
    private String name;
    private String medCon;

    public Organ(String name, String medCon) {
        this.name = name;
        this.medCon = medCon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMedCon() {
        return medCon;
    }

    public void setMedCon(String medCon) {
        this.medCon = medCon;
    }
}
