package com.gamingz.Start;

class Printer{

    <T> void printArray(T[] arr){
        for(T element : arr){
            System.out.println(element);
        }

    }
}
public class Test {

    public static void main(String[] args) {

        Printer print = new Printer();
        Integer[] arr = {2,3,1};
        print.printArray(arr);

        String[] str = {"hello","harsh"};
        print.printArray(str);





    }
}
