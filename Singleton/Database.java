package com.gamingz.Singleton;

public class Database {
    private String name;

    private static Database instance;  // This code declares a private static variable called "instance" of type "Database"
                                       // just like Database database = new Database(name);

    public static synchronized Database getInstance(String name){   // The "synchronized" keyword here ensures that
                                                                    // only one thread can enter this method at a time.
        if(instance==null){
            instance = new Database(name);
        }
        return instance;

    }
    /*
        The return type of the getInstance() method is Database, which means that when the method is called,
        it will return an object of type Database. In other words, the method returns an instance of the Database class.
    */

    private Database(String name) {        // making the constructor private so that it prevents external instantiation
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // -------------unrelated concept--------------------

    @Override
    public String toString() {                    // intially toString() method would return address of Database class
        String text = "Database class\n"+"Name: "+this.name;
        return text;
    }
}
