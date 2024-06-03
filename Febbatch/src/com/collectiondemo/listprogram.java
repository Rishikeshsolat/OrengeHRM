package com.collectiondemo;
import java.util.*;
public class listprogram {

    
    public static void main(String[] args) {
        
        String str = "aabbccddee";
        
        HashSet<Character> set = new HashSet<>();
        
        char[] ch = str.toCharArray();
        
        for(char c: ch) {
            set.add(c);
        }
        
        // Using StringBuilder to efficiently build the new string
        StringBuilder stringBuilder = new StringBuilder();
        
        // Creating an iterator to iterate through the elements of the HashSet
        Iterator<Character> iterator = set.iterator();
        
        // Appending each character from the HashSet to the StringBuilder
        while(iterator.hasNext()) {
           // stringBuilder +=iterator.next();
        }
        
        // Converting the StringBuilder to a new string
        String newString = stringBuilder.toString();
        
        System.out.println(newString);
    }
}

