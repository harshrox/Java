package com.gamingz.Collections;
import java.util.ArrayList;
public class ArrayList0 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();  // Cannot use primitive data type like int.
        names.add("Harsh");
        names.add("Hritik");
        names.add("Ajay");



        names.remove("Harsh");

        names.add(0,"Akshay");

        names.set(1,"Harsh");



        System.out.println(names.get(0));
        System.out.println(names.get(1));
        System.out.println(names.get(2));

        System.out.println(names.size());

        System.out.println(names.indexOf("Ajay"));

        System.out.println(names.indexOf("Anand"));

        System.out.println(names.contains("Akshay"));

        System.out.println(names.isEmpty());

        names.clear();

        System.out.println(names.isEmpty());
    }

}
