package com.akanksha.MathQues;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = pallindrome(num);
        if(num==rev){
            System.out.println("Number is pallindrome");
        }else{
            System.out.println("Number is not pallindrome");
        }

    }

    private static int pallindrome(int num) {
        int res =0;
        while(num!=0){
            res = (res*10) + (num%10);
            num = num/10;
        }
        return res;
    }
}
