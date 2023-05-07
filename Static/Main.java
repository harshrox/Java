package com.gamingz.Static;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Company.companyName="Amazon";
        Company.setCompanyName("Amazon"); /* hides the implementation detail . If the implementation of setting
                                           the field value changes in the future, there is no need to modify
                                           any other code that uses the setter method. */

        Company alexa = new Company("Akshay",25);
        Company prime = new Company("Ajay",27);
        Company marketing = new Company("Satyam",23);
        Company temp = null;


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a choice (alexa,prime,marketing)-");
        String choice= scan.next();


        if(choice.equalsIgnoreCase("alexa")){
            temp = alexa;
        }
        else if (choice.equalsIgnoreCase("prime")) {
            temp = prime;
        }
        else if (choice.equalsIgnoreCase("marketing")) {
            temp = marketing;
        }

        if(temp!=null) {
            System.out.println("Company: "+temp.getCompanyName());
            System.out.println("Name: "+temp.getName());
            System.out.println("Age: "+temp.getAge());
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
