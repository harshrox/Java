package com.gamingz.Start;

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
public class Test1 {

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        outer.setX(50);
        inner.printX();

    }

}