package com.gamingz.AbstractClasses;

public class TestClass extends AbstractClass {
    @Override
    public void printName(String name) {
        System.out.println("Name: " + name);
    }

    // ??
    public TestClass(String branch) {
        super(branch);
    }

    @Override
    public String getBranch() {
        return super.getBranch();
    }

    @Override
    public void setBranch(String branch) {
        super.setBranch(branch);
    }
}