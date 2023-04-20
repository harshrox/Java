package com.gamingz.Static;

public class Company {
    public static String companyName;
    public String name;
    public int age;

    public Company(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static String getCompanyName() {
        return companyName;
    }

    public static void setCompanyName(String companyName) {
        Company.companyName = companyName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
















