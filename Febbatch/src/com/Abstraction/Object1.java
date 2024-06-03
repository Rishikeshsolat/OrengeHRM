package com.Abstraction;

public class Object1 {
    // Static variable to keep track of the number of objects created
    public int count = 0;

    // Constructor to increment the count when an object is created
    public Object1() {
        count++;
        System.out.println("Object count: " + count);
    }

    public static void test() {
        
        System.out.println("Total number of objects created: " );
    }
}
