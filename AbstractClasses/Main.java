package com.gamingz.AbstractClasses;

public class Main {
    public static void main(String[] args) {
        AbstractClass abstractClass = new TestClass("CSE");
        abstractClass.printName("Harsh");
        abstractClass.printBranch();

        TestClass testClass = new TestClass("ECE");
        testClass.printHey(4);
    }
}
