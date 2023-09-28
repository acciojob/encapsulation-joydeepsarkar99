package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();

        //we cant directly access the private instance variable of the RWOnly class so thats why we use getter and setter
        //obj.name = "Joydeep";
        //System.out.println(obj.name);

        // after using getter and setter   method
        obj.setName("Joydeep");
        String s = obj.getName();
        System.out.println(s);
    }
}