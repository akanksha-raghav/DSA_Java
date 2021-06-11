package com.akanksha.class1.patterns;

import java.util.Scanner;

public class HollowTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==1){
            System.out.println("*");
        }else {
            hollowtri(n);
        }
    }

    private static void hollowtri(int n) {
        System.out.println("*");
        for(int i=2;i<=n-1;i++){
            System.out.print("* ");
            for(int j=1;j<=i-2;j++){
                System.out.print("  ");
            }
            System.out.print("* ");
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            System.out.print("* ");
        }
    }
}
