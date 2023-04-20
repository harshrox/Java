package com.gamingz.Start;

import java.util.Random;
import java.util.Scanner;

public class Game1 {

    public static void main(String[] args) {

        //GUESSING GAME
        System.out.println("WELCOME TO THE GUESSING GAME");
        System.out.println("Please enter your name-");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("");
        System.out.println("Hello "+name+" , lets start the game");
        System.out.println("");
        System.out.println("Press 'y' to continue the game or 'n' to close the game-");
        String choice = scan.next();

        int flag=0;
        if(choice.equalsIgnoreCase("y")){
            Random random = new Random();
            int ran = random.nextInt(51);
            for(int i=0;i<5;i++) {
                System.out.println("");
                System.out.println("Choice number- "+(i+1));
                System.out.println("Enter a number between 0 and 50 both inclusive-");
                int guess = scan.nextInt();
                if(guess==ran){
                    System.out.println("CORRECT GUESS "+name.toUpperCase()+"!!! YOU WON THE GAME");
                    flag=1;
                    break;
                }
                else if (guess<ran) {
                    System.out.println("HINT: Go for a higher number than "+guess);

                }
                else {
                    System.out.println("HINT: Go for a lower number than "+guess);
                }

            }
            if (flag==0){
                System.out.println("Sorry "+name+"!! you lost the game");
                System.out.println("The number was "+ran);
            }
        }
        else {
            System.out.println("Goodbye "+name);
        }
    }
}
