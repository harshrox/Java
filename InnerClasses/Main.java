package com.gamingz.InnerClasses;

class OuterClass {
    private int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    class InnerClass {
        public void printX() {
            System.out.println(x);

        }
    }
}
public class Main {

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        outer.setX(100);
        inner.printX();

    }

}