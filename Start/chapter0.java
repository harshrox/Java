/*

        int var=9;
        double num=9.2;
        float num2=(float)8.3;

        for(int i=0;i<10;i++){
            System.out.println("Hello World "+var+num+num2+i);

        }

        // Input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number-");
        int a = scan.nextInt();
        System.out.println("Enter your name-");
        String b= scan.next();

        System.out.println(a+" "+b.toUpperCase());

        // Random Number
        Random random = new Random();
        int ran = random.nextInt(20) + 10;
        System.out.println(ran);

        // Loops in java are same as C.

        // Simple Arrays
        String[] students = new String[5];

        String[] employees = {"Harsh","Ayush","Aryan"};

        int[] numbers = new int[10];

        int[] digits = {1,2,8,5,4};

        array.length -> to check array lenth;

            == should not be used to equate two strings
        {
            String str1 = "hello";
            String str2 = "hello";
            String str3 = new String("hello");

            System.out.println(str1 == str2); // true, because both str1 and str2 reference the same String object in memory
            System.out.println(str1 == str3); // false, because str3 is a new String object with a different memory address
            System.out.println(str1.equals(str3)); // true, because the contents of str1 and str3 are the same

        }


        To check if a string is lexicographically greater or smaller--
        int out = str1.compareTo(str2);
        if out is >0 then str1 is lexicographically greater else it is smaller.

        To capitalize first letter of a string str--
        String str2 = str.substring(0,1).toUpperCase() + str.substring(1);

        To convert integer to string--
        String s = Integer.toString(n);

        To convert string to integer--
        int n = Integer.parseInt(s);

        To get the char at i position in a string--
        String A = str.charAt(i);



        // Object Oriented Programming (OOP)

        Use first letter as capital for naming the class.

        A class is a blueprint or a template that defines the properties(fields) and behaviors of objects.
        It is like a recipe for creating objects.

        To create a car object in Java, you would first define a class for it.
                The class would specify the car's properties and behaviors, and any other relevant information.

        An object is an instance of a class that has its own set of properties and behaviors defined by that class.

        In summary, a class in Java is a blueprint that defines the properties and behaviors of objects. It allows
         you to create objects of the same type, with the same properties and behaviors, which can then be manipulated
         as needed.

        String name is same as public String name.

        // Example--

        public class Phone {

            String name;
            int RAM;
            int camera;


            public void playMusic(String trackName) {    // defining method
                System.out.println("Playing "+trackName);
            }
        }


        Main Class-->

        public class UsingPhone {
            public static void main(String[] args) {
                Phone moto = new Phone();
                moto.name = "moto g60";
                moto.RAM = 6;
                moto.camera = 108;

                System.out.println("Launching new motorola phone "+moto.name);
                System.out.println("It has an impressive camera of "+moto.camera+" MP");
                System.out.println("With a powerful RAM of "+moto.RAM+" GB");

                moto.playMusic("Never Enough");

            }
        }





// Encapsulation--

 Encapsulation refers to the practice of hiding the implementation details of a class and only exposing a public interface to interact with it.
 This means that the class data and behavior are protected from external access and modification.
 Encapsulation can be accessed by access modifiers.

 Access modifiers-
     Public: A public class can be accessed from anywhere, and by any code that has visibility of the class.
            This means that any code can create an instance of a public class and call its methods.

     Default (also known as package-private): A class with no access modifier specified is considered to have
            default (package-private) access. This means that the class can only be accessed by other classes within
            the same package. It cannot be accessed from outside the package, even if the other code is in the same project.

     Protected: A protected class can be accessed by classes within the same package, as well as by subclasses of the
            class, regardless of their package. This means that a subclass in a different package can access a protected
            class as long as it extends the protected class.

     Private: A private class can only be accessed by the class that defines it. This means that no other class can
             create an instance of the private class or call its methods. The protected access modifier allows a class
             member to be accessible within the same package and also by its subclasses, regardless of whether they
             are in the same package or not.

 If we want to access any private field/property from outside the class , we can do that by using the
 method(getter and setter)

 "this.name" refers to the "name" variable of the current object instance, and "name" refers to the parameter passed
  to the method.

 The purpose of this method is to set the value of the "name" variable of the current object instance to the value
 passed as the parameter to the method.

 To print the address of a class use System.out.println(this)

We need Getter and Setter for encapsulation.

// Difference between System.out.println(this.name); and System.out.println(this.getName());
    System.out.println(this.name) will print the value of the instance variable name directly. This assumes that the
    name variable is accessible from the current scope and that it is a public or package-private field of the object.
    If the name variable is private, protected, it can't be accessed from outside the object, and
    using this.getName() would be required.

//Example--

public class Phone {

    //public String name;
    private String name;
    int RAM;
    int camera;

    public void setName(String name) {
        this.name = name; // "this" refers to the current object instance on which the method is being called.
    }


    public String getName() {
        return this.name;
    }

    public void playMusic(String trackName) {    // defining method
        System.out.println("Playing "+trackName);
    }
}

Main Class--

public class UsingPhone {
    public static void main(String[] args) {
        Phone moto = new Phone();
        //moto.name = "moto g60";
        moto.setName("moto g60");
        moto.RAM = 6;
        moto.camera = 108;

        //System.out.println("Launching new motorola phone "+moto.name);
        System.out.println(moto.getName());
        System.out.println("It has an impressive camera of "+moto.camera+" MP");
        System.out.println("With a powerful RAM of "+moto.RAM+" GB");

        moto.playMusic("Never Enough");

    }
}


//Constructor--
 A constructor is a special method that is used to initialize objects of a class. It is a method that has the same name as the class and does not have a return type.
When an object of a class is created using the "new" keyword, the constructor is called automatically and initializes the object with initial values or values passed as arguments to the constructor.
 Constructors can be overloaded, which means that there can be multiple constructors with different parameters.

Example--

public class Phone {
    String name;
    int camera;
    int RAM;

    // Constructor
    public Phone(String name, int camera, int RAM) {
        this.name = name;
        this.camera = camera;
        this.RAM = RAM;
    }
}

Main class--

public class Main {
    public static void main(String[] args) {

        Phone moto = new Phone("moto g60", 108, 6);

        System.out.println("Launching new motorola phone "+moto.name);
        System.out.println("It has an impressive camera of "+moto.camera+" MP");
        System.out.println("With a powerful RAM of "+moto.RAM+" GB");

    }
}




// Inheritance--
 Inheritance is a mechanism that allows a new class to be based on an existing class.
 The new class inherits the properties and behaviors (methods) of the existing class,
 and can also add new properties and behaviors or modify the inherited ones.

The class that is being inherited from is called the superclass or parent class,
and the class that inherits from it is called the subclass or child class.

Example-

    // Superclass
    class Animal {
       public void eat() {
          System.out.println("This animal is eating.");
       }
    }

    // Subclass
    class Dog extends Animal {
       public void bark() {
          System.out.println("Woof!");
       }
    }

    // Main program
    public class Main {
       public static void main(String[] args) {
          Dog bulldog = new Dog();
          bulldog.eat(); // inherited from Animal class
          bulldog.bark(); // defined in Dog class
       }
    }
Better example in OOP2 package.

@override is used to overwrite the method of parent class in child class.

// A random note--
    When a method in a subclass overrides a method in superclass, it is still possible to call the overridden
    method using super keyword.
    If you write super.func() to call the function func(), it will call the method that was defined in the superclass.

Example-

    class Animal {
       public void makeSound() {
          System.out.println("The animal makes a sound");
       }
    }

    class Dog extends Animal {
       @Override
       public void makeSound() {
          System.out.println("The dog barks");
       }
    }

    public class Main {
       public static void main(String[] args) {
          Animal myAnimal = new Animal();
          Animal myDog = new Dog();

          myAnimal.makeSound(); // prints "The animal makes a sound"
          myDog.makeSound();    // prints "The dog barks"
       }
    }

// Polymorphism--
Polymorphism means having multiple forms.
It is the principle of treating objects of different classes as if they are objects of the same class.

Polymorphism type 1-
Having multiple constructors for a class.

Polymorphism type 2-
Overriding the method of parent class in child class.

Polymorphism type 3-
Defining different parameters for a single method inside a class.
Example-
    public void eat() {
          System.out.println("This animal is eating.");
    }

    public void eat(int number) {
          System.out.println("This animal is eating "+number+" bananas.");
    }

    The two methods are same i.e eat but they are taking different arguments inside the method.

    // A random note--
    In most cases, you will need both a constructor and getter/setter methods in your class to properly manage the state of your objects.
    The constructor sets the initial values of the object's state, while the getter/setter methods allow you to access and modify the object's state as needed.

    // clicking on a keyword or method and pressing ctrl+Q gives a brief about that keyword or method.
    // or press ctrl key and hover over the keyword or method to get a brief about that.


// Composition--
 Composition refers to the concept of creating a class by combining objects of other classes as instance variables.
 This allows you to reuse existing code and build more complex and specialized classes by assembling smaller, reusable objects.
Example-- in OOP3 package

// null keyword -> to postpone the instantiation of an object
Example-> Instead of Car mercedes = new Car()
                    Car mercedes = null; // postponing the instantiation

// final keyword -> to fix the value
Example-> final int a=5;
          a=a+1;  // won't work since a is fixed to 5
Example-> final Engine engine = new Engine("Renault",8000);
          Engine engine = new Engine("Corvette",5000); // won't work

          engine.setRpm(7000);  // will work

          changes in properties/fields can be done even after using final keyword before the object instantiation.

// A random note-
                float x = 3.14f; // The 'f' suffix indicates that this is a float literal
                float x = 3.14; // Error: Type mismatch: cannot convert from double to float



// Output formatting

1) System.out.printf()-->
    double num = 3.14159;
    System.out.printf("The value of pi is approximately %.2f\n", num);

2) String.format()--> same as printf but rather than printing on console screen ,it stores/returns the string.
    String name = "Alice";
    int age = 25;
    String formattedString = String.format("My name is %s and I am %d years old.", name, age);

3) DecimalFormat class-->
    double num = 3.14159;
    DecimalFormat df = new DecimalFormat("#.##");
    String formattedString = df.format(num);

4) String.format() flags-->
    Case 1->
        int num = 42; //integer
        System.out.printf("The number is %05d\n", num); // Output->The number is 00042

        0 - This is a flag that specifies that the output should be padded with leading zeros.
        5 - This is the width of the field in which the output will be printed.
            It specifies the total number of characters to be used for printing the output, including any
            leading zeros and the actual value of the number.

    Case 2->
        float num=1234.57f;
        System.out.printf("%8.1d\n", num); // Output->__1234.5

        8 - This is the minimum width of the field in which the output will be printed.
            It specifies the total number of characters to be used for printing the output,
            including the decimal point and any leading spaces.
        .1 -This is the precision or the number of digits to be printed after the decimal point.
             In this case, it specifies that one digit should be printed after the decimal point.

    Case 3->
        float num = 42.567f; // float
        System.out.printf("The number is %05.1f\n", num); // Output: The number is 042.5

        0 - This is a flag that specifies that the output should be padded with leading zeros.
        5 - This is the width of the field in which the output will be printed. It specifies
            the total number of characters to be used for printing the output, including any leading zeros
            and the actual value of the number.
        .1 -This is the precision specifier that specifies the number of digits to be displayed
            after the decimal point.

    Case 4->
        String s = "hello";
        String padded = String.format("%15s hii", s); // Right Justified String
        System.out.println(padded);

        To get width of 15 on left side.

    Case 5->
        String s = "hello";
        String padded = String.format("%-15s hii", s); // Left justified String
        System.out.println(padded);

        To get width of 15 on right side.

*/

