package com.akanksha.class3;

import java.util.Arrays;

public class StringsIntro {
    public static void main(String[] args) {
        // IMMUTABLE
        String name1 = "akanksha";
        String name2 = "akanksha";
        System.out.println(name1==name2); // check object of refernce
        System.out.println(name1.equals(name2)); // check the value
        char[] arr = name1.toCharArray();
        System.out.println(Arrays.toString(arr));
        System.out.println(name1.substring(1,4));
        String values = "hello everyone my name is Akanksha";
        String[] value =values.split(" ");
        System.out.println(Arrays.toString(value));
        System.out.println(name1.indexOf('s'));
        String sent = "     hello all      ";
        System.out.println(sent);
        System.out.println(sent.strip());
    }
}
