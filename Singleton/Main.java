package com.gamingz.Singleton;

import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args) {
        Database database = Database.getInstance("Harsh");   // Instantiation only possible for one time

        Database database2 = Database.getInstance("Rahul");

        // Using Database database = new Database("Satyam"); would throw error


        System.out.println(database.getName());
        System.out.println(database2.getName()); // Prints Harsh instead of Rahul
    }


}
