package com.gamingz.Exceptions;

public class Main {
    public static void main(String[] args) {
        int a=2;
        int b=0;

        // when type of exception is known
        try {
            System.out.println(a/b);
        }
        catch (ArithmeticException e){
            System.out.println("B was zero");
        }

        // when type of exception in unknown
        try {
            System.out.println(a/b);
        }
        catch (Exception e){
            System.out.println("B was again zero");
        }

        // null pointer exception
        String name = null;
        try {
            System.out.println(name.equals("Harsh"));
        }
        catch (NullPointerException e){
            e.printStackTrace();     // to get the details of exception
            System.out.println("Name was null");
        }

    }
}
