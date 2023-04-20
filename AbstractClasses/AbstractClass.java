package com.gamingz.AbstractClasses;

public abstract class AbstractClass {
    private String branch;

    // ??
    public AbstractClass(String branch) {
        this.branch = branch;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void printBranch(){
        System.out.println("Branch: "+this.getBranch());
    }

    public abstract void printName(String name);
}
