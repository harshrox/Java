package com.gamingz.Singleton;

import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args) {
        Database database = Database.getInstance("Harsh");   // Instantiation only possible for one time
        /* why is there Database.getInstance() instead of database.getInstance() ?
        Answer--  when you call a static method like getInstance() on a class, you can do so using either
                  the class name or an instance of the class.

                  Refer to static method notes.

         */


        Database database2 = Database.getInstance("Rahul"); // wouldn't do anything

        // Using Database database = new Database("Satyam"); would throw error


        System.out.println(database.getName());
        System.out.println(database2.getName()); // Prints Harsh instead of Rahul

        // ------------unrelated concept--------------------------
        System.out.println(database.toString()); // prints info about Database class
    }


}
