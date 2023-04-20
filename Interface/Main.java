package com.gamingz.Interface;

public class Main {
    public static void main(String[] args) {
        CarInterface carInterface = new ElectricCar("Tesla"); // Assigning a class to the interface (we can do this because ElectricCar class has already implemented the CarInterface interface)
        carInterface.start();
        carInterface.move(80);

        // Now you can understand the below code
        /*
            List<String> names = new ArrayList<>();

            Here Arraylist<> is a class and List<> is an interface
            and ArrayList<> has been assigned to the interface List<>
         */
    }
}
