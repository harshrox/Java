package com.gamingz.OOP.OOPchallenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int flag=1;

        Info patient = new Info("Tom",25);
        LeftEye left = new LeftEye("Left Eye","Short sighted","Blue");
        RightEye right = new RightEye("Right Eye","Normal","Blue");
        Heart heart = new Heart("Heart","Normal",65);
        Stomach stomach = new Stomach("Stomach","PUD");
        Skin skin = new Skin("Skin","Burned");

        System.out.println("Name: "+patient.getName());
        System.out.println("Age: "+patient.getAge());

        while (flag==1){
            System.out.println("Choose an Organ:");
            System.out.println("\t1. Left Eye");
            System.out.println("\t2. Right Eye");
            System.out.println("\t3. Heart");
            System.out.println("\t4. Stomach");
            System.out.println("\t5. Skin");
            System.out.println("\t6. Quit");

            Scanner scan = new Scanner(System.in);
            int choice = scan.nextInt();

            if(choice==1){
                System.out.println("Name: "+left.getName());
                System.out.println("Medical Condition: "+left.getMedCon());
                System.out.println("Color: "+left.getColor());
                System.out.println("\t1. Close the Eye");
                int eyeLeft = scan.nextInt();
                if(eyeLeft==1){
                    left.closeEye();
                }

            }
            else if (choice==2){
                System.out.println("Name: "+right.getName());
                System.out.println("Medical Condition: "+right.getMedCon());
                System.out.println("Color: "+right.getColor());
                System.out.println("\t1. Close the Eye");
                int eyeRight = scan.nextInt();
                if(eyeRight==1){
                    right.closeEye();
                }

            }
            else if (choice==3){
                System.out.println("Name: "+heart.getName());
                System.out.println("Medical Condition: "+heart.getMedCon());
                System.out.println("Heart rate: "+heart.getHeartRate());
                System.out.println("\t1. Change the heart rate");
                int change = scan.nextInt();
                if(change==1){
                    heart.changeHeartRate();
                }

            }
            else if (choice==4) {
                System.out.println("Name: "+stomach.getName());
                System.out.println("Medical Condition: "+stomach.getMedCon());
                System.out.println("Need to be fed");
                System.out.println("\t1. Digest");
                int digest = scan.nextInt();
                if(digest==1){
                    stomach.digest();
                }


            }
            else if (choice==5) {
                System.out.println("Name: "+skin.getName());
                System.out.println("Medical Condition: "+skin.getMedCon());
            }
            else{
                flag=0;
            }
        }


    }
}
