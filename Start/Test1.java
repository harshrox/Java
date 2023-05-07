package com.gamingz.Start;

class Var<T>{
    private T any;

    public T getAny() {
        return any;
    }

    public void setAny(T any) {
        this.any = any;
    }

    public Var(T any) {
        this.any = any;
    }
}

public class Test1 {
    public static void main(String[] args) {
        Var num = new Var(1234.57);
        Var string = new Var("Harsh");

        System.out.printf("%f\n", num.getAny());
        String padded = String.format("%10s hii", string.getAny()); // Right Justified String
        System.out.println(padded);
    }

}
