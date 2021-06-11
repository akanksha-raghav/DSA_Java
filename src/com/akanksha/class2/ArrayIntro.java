package com.akanksha.class2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
       // System.out.println(nums);  returns unique hashcode
        System.out.println(Arrays.toString(nums)); // can traverse and print
    }
}
