/*

     In Java, there are two categories of data types: primitive data types and reference data types.
     Primitive data types are the basic building blocks of data in Java, whereas reference data types
     are more complex data types that are built using primitive data types. Here's an explanation of each data type
     with examples:

     Primitive Data Types:

        byte: A byte is an 8-bit signed two's complement integer, with a minimum value of -128(2^7) and
              a maximum value of 127(2^7 -1).
              Example: byte b = 100;

        short: A short is a 16-bit signed two's complement integer, with a minimum value of -32,768(2^15) and
               a maximum value of 32,767(2^15 -1).
               Example: short s = 1000;

        int: An int is a 32-bit signed two's complement integer, with a minimum value of -2^31 and
             a maximum value of 2^31-1.
             Example: int i = 1000000;

        long: A long is a 64-bit signed two's complement integer, with a minimum value of -2^63 and
              a maximum value of 2^63-1.
              Example: long l = 1000000000L;

        float: A float is a 32-bit single-precision floating-point number.
               Example: float f = 3.14f;

        double: A double is a 64-bit double-precision floating-point number.
                Example: double d = 3.14159;

        char: A char is a 16-bit Unicode character.
              Example: char c = 'a';

        boolean: A boolean represents a logical value, either true or false.
               Example: boolean b = true;

    Reference Data Types:
        String: A String is a sequence of characters.
                Example: String s = "Hello World";

        Arrays: An array is a collection of elements of the same data type.
                Example: int[] arr = {1, 2, 3, 4, 5};

        Class: A Class represents a class or interface in Java.
                Example: Class cls = String.class;

        Object: An Object is the root class of all classes in Java.
                Example: Object obj = new Object();

        Wrapper classes: The wrapper classes provide a way to use primitive data types as reference data types.
                Example: Integer i = new Integer(100);

        More about Wrapper class-->
            A wrapper class is a class that wraps (encapsulates) a primitive data type, providing it with additional
            methods and functionality.Wrapper classes are used to convert primitive data types into objects, so that
            they can be passed as parameters to methods that require objects.

            There are eight primitive data types in Java: byte, short, int, long, float, double, boolean, and char.
            For each of these primitive data types, there is a corresponding wrapper class:

                # Byte for byte
                # Short for short
                # Integer for int
                # Long for long
                # Float for float
                # Double for double
                # Boolean for boolean
                # Character for char

            Wrapper classes provide several methods for converting between primitive data types and objects.
            For example, the Integer class provides methods like parseInt() for converting a string to an
            integer, and valueOf() for converting a primitive int to an Integer object.

            Wrapper classes are also used to provide additional functionality for primitive data types.
            For example, the Double class provides methods like isNaN() for checking if a number is not a number,
            and isInfinite() for checking if a number is infinite.


    Java Generics-->
        Java Generics is a feature of the Java programming language that allows you to define classes, interfaces,
        and methods that can work with different types of objects. Generics provide a way to create code that is
        more flexible, reusable, and type-safe.

        Example->
            class Box<T> {
                private T contents;

                public void setContents(T contents) {
                    this.contents = contents;
                }

                public T getContents() {
                    return contents;
                }
            }

            Here, T is used to denote a class or interface which maybe Integer or String.
            The letter T is commonly used as a placeholder to represent a
            specific type that will be specified later when the code is used.

            Remember parameter <T> only accepts reference types (i.e., classes and interfaces),
            for example Integer, String and not int.

        Example->
            class Printer
                {

                    <T> void printArray(T[] arr){
                        for(T element : arr){
                            System.out.println(element);
                        }

                    }
                }

            Here, T element : arr means all the elements of T Class in array 'arr'.


    // Collections--

        In Java, a collection is like a container that can hold a bunch of things together.
        These things could be anything - numbers, words, or even other containers like collections themselves.

        There are different types of collections in Java, and each one has its own way of storing and
        organizing the things inside it. For example, a list is a collection where things are stored in a certain order,
         like a shopping list where the items are listed in the order you need to buy them. A set is a collection where
         each thing can only be in there once, like a collection of unique toys.

        Collections are useful because they let you do things with all the things inside them. For example, you can add
         new things, remove things you don't need anymore, or find out how many things are inside.

        There are also lots of special ways you can use collections to do things like sorting them or searching for
         specific things inside them.

        Overall, collections in Java are just a way to keep things organized and together, so you can do things with
        them easily.

        // ArrayList

            In Java, an ArrayList is a type of collection that can dynamically store a group of objects in an ordered list.
            It is part of the Java Collections Framework and is implemented as a resizable array.

            Here are some key features of ArrayList in Java:

            Ordered: Elements in an ArrayList are ordered, meaning they are stored in a specific sequence.

            Resizable: The size of an ArrayList can be dynamically increased or decreased as needed, allowing for
                    flexible storage of elements.

            Indexed: Each element in an ArrayList can be accessed using an index. The index starts at 0 for the first
                    element and increments by 1 for each subsequent element.

            Generic: An ArrayList can store any type of object, including objects of different types. Java supports
                    the use of generics to ensure type safety.

            Fast access: Accessing an element in an ArrayList is fast since each element has an index that can be used
                    to quickly retrieve it.


        // Map--

            In Java, a Map is an interface that maps keys to values. It doesn't allow duplicate keys, and each key can
            only be associated with one value. You can use a key to retrieve its corresponding value from the Map.
            Java has several classes that implement the Map interface, such as HashMap, TreeMap, and LinkedHashMap,
            each with its own characteristics and performance trade-offs.

    // Static keyword--
        Static keyword ensures that a defined variable/method is same for all the instances(objects) of that particular
        class.This means that a static variable or method can be accessed without creating an instance of the class.
        // main class is also static(psvm)
        For example, refer static.java

    // Inner classes--
        An inner class is a class that is defined within the body of another class (nested class).

        Benefits--> inner classes can be declared as private and static which is not the case with one parent class.
        There are four types of inner classes(will talk further about this)
        Example-
            public class OuterClass {
                private int x;

                class InnerClass {
                    public void printX() {
                        System.out.println(x);
                    }
                }
            }

    // Interface
        Interface is like a signature of a class meaning we define some abstract methods without adding body to it
        in an interface and later on add functionality to that abstract method in a class.

        Abstract methods inside interface can have only public access modifier and hence it is recommended to
        not write public since it is the default access modifier.

        Ex-
            //Creating interface--

                public interface MyInterface {
                    void doSomething();   //naming the abstract method
                    int doSomethingElse(String str);
                }

            //Implementing the interface--

                // Multiple interfaces can be implemented at the declaration of class by using a comma.
                public class MyClass implements MyInterface {
                    public void doSomething() {
                        // implementation code here
                    }
                    // use ctrl+i to implement the abstract method
                    // or
                    // use ctrl+o to override/implement the methods
                    public int doSomethingElse(String str) {
                        // implementation code here
                        return 0;
                    }
                }

    // Abstract classes
        Abstract classes work same as interfaces but there are few differences--
            i) Abstract classes are not implemented rather they are extended.
            ii) A class cannot extend multiple Abstract class at the same time.
            iii) Abstract classes may have non-abstract fields and non-abstract methods unlike interfaces.

    //  Concurrency -> Execution of multiple programs at the same time.
        // Thread
             A thread is a separate path of execution within a program. Multiple threads can run concurrently
             within a single program, allowing for more efficient use of system resources and increased
             responsiveness to user input.

             main function/method in java is executed in the main thread.When a Java program is executed, a single
             thread of execution, known as the main thread, is created automatically by the Java Virtual Machine (JVM).
             The main thread then starts the execution of the main method of the program.

             Other threads can also be created within main function/method and those will run concurrently with the main thread.

             Creating and running threads can make a program more asynchronous and concurrent.
                //Asynchronous: A program or operation is asynchronous if it doesn't block the main execution thread or process.
                 Instead, it allows other operations or threads to continue executing while it's waiting for some resource
                 or event. Asynchronous programming is often used for I/O operations or long-running tasks, where blocking
                 the main thread would result in poor performance and responsiveness.

                //Concurrent: A program or operation is concurrent if it's divided into multiple parts that can be executed
                 independently and simultaneously. Concurrent programming is often used to improve performance, by executing
                 multiple tasks in parallel, and to simplify program structure, by dividing complex tasks into smaller,
                 more manageable parts.

             // For future reference
                The following concepts are important when working with threads:

                    Thread class: Java provides the Thread class to create and control threads. The Thread class encapsulates
                    a thread of execution and provides methods to start, stop, and monitor the thread's status.

                    Runnable interface: Java also provides the Runnable interface, which represents a task that can be executed
                    by a thread. The Runnable interface has a single method, run(), that defines the task's code.

                    Thread states: A thread can be in one of several states, such as new, runnable, blocked, waiting, timed
                    waiting, or terminated. These states represent the thread's current status and determine how it can be scheduled
                    for execution.

                    Thread synchronization: When multiple threads access shared resources or variables, there can be race conditions
                    or other synchronization issues. Java provides synchronization mechanisms, such as locks, semaphores, and monitors,
                     to ensure that threads access shared resources safely and correctly.

                    Thread communication: Threads can communicate with each other using inter-thread communication mechanisms, such
                    as wait(), notify(), and notifyAll(). These mechanisms allow threads to signal events or conditions and to coordinate
                    their actions.

                    Thread pools: Creating and starting threads can be expensive, especially if a program needs to create many threads.
                    Thread pools are a way to reuse threads and to limit the number of active threads, while still allowing multiple
                    tasks to be executed concurrently






    // Exceptions
         The following are some of the different types of exceptions in Java:

            1) Checked Exceptions: These are the exceptions that are checked at compile-time. They are checked to ensure that the
            program handles them properly. Some examples of checked exceptions include IOException, SQLException, and ClassNotFoundException.

            2) Unchecked Exceptions: These are the exceptions that are not checked at compile-time. They occur at runtime and are also known
            as runtime exceptions. Some examples of unchecked exceptions include NullPointerException, ArithmeticException, and
            ArrayIndexOutOfBoundsException.

            3) Error: These are the exceptions that are thrown by the JVM when a serious problem occurs. Examples of errors include
            OutOfMemoryError, StackOverflowError, and LinkageError.

            4) Custom Exceptions: Java also allows programmers to define their own custom exceptions by extending the Exception class or
            its subclasses. Custom exceptions are useful when a program needs to handle specific types of exceptions that are not covered
            by the built-in exceptions.

    // Singleton Pattern
        The Singleton pattern is a design pattern in Java that restricts the instantiation of a class to one object. This means that
        only one instance of a class can exist at a time, and that instance can be accessed globally throughout the program.











 */