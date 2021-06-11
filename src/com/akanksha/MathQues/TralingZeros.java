package com.akanksha.MathQues;

import java.util.Scanner;

public class TralingZeros {
    // 2 and 5
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(trailingZero(num));
    }

    private static int trailingZero(int num) {
        int res =0;
        for(int i=5;i<=num;i=i*5){
            res = res+ num/i ;
        }
        return res;
    }
}
