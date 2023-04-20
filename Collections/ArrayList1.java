package com.gamingz.Collections;
import java.util.ArrayList;

class Student {
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
public class ArrayList1 {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Harsh",898));
        students.add(new Student("Aryan",881));

        System.out.println(students.get(0).getName() + " " + students.get(0).getId());

        for(Student s : students){
            System.out.println(s.getName());
        }
    }



}
