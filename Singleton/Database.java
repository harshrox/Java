package com.gamingz.Singleton;

public class Database {
    private String name;

    private static Database instance;  // This code declares a private static variable called "instance" of type "Database".

    public static synchronized Database getInstance(String name){   // Synchronising prevents instantiation from multiple threads
        if(instance==null){
            instance = new Database(name);
        }
        return instance;
    }

    private Database(String name) {        // making the constructor private so that it prevents external instantiation
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
