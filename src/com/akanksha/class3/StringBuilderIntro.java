package com.akanksha.class3;

public class StringBuilderIntro {
    public static void main(String[] args) {
//        String str = "";
//        for (int i = 0; i < 100; i++) {
//            str+=i;
//        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            builder.append(i);
        }
        System.out.println(builder); // didn't make new objects but change in the original one
    }
}
