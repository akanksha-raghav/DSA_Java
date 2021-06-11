package com.akanksha.class3;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String str1 = sc.next(); //for char
        String str = sc.nextLine(); //for whole line
        substr(str);
    }

    private static void substr(String str) {
        // substr(inclusive , exclusive)
        String res;
        for (int i = 0; i < str.length(); i++) {
            for(int j = i+1; j<=str.length(); j++){
                res = str.substring(i,j);
                System.out.println(res);
            }
        }
    }
}
