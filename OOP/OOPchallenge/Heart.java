package com.gamingz.OOP.OOPchallenge;

import java.util.Scanner;

public class Heart extends Organ{

    private int heartRate;
    public Heart(String name, String medCon, int heartRate) {
        super(name, medCon);
        this.heartRate = heartRate;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public void changeHeartRate(){
        System.out.println("Enter the new heart rate:");
        Scanner heart = new Scanner(System.in);
        int heartrate = heart.nextInt();

        this.heartRate = heartrate;

        System.out.println("Heart rate changed to: "+heartrate);
    }
}
