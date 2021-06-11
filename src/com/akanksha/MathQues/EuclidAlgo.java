package com.akanksha.MathQues;

import java.util.Scanner;

public class EuclidAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("GCD of "+num1+" and "+num2+" is "+gcd(num1,num2));
    }

    private static int gcd(int num1, int num2) {
        if(num2 ==0) return num1;
        else
            return gcd(num2,num1%num2);
    }
}
