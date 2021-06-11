package com.akanksha.MathQues;

import java.util.Arrays;

public class SieveOfErato {
    public static void main(String[] args) {
        int n = 20;
        boolean[] arr = primeRange(n);
        for (int i = 0; i <=20 ; i++) {
            if(arr[i] == true){
                System.out.println(i + " " + arr[i]);
            }
        }
    }

    private static boolean[] primeRange(int n) {
        boolean[] nums = new boolean[n + 1];
        Arrays.fill(nums, true);
        nums[0] = false;
        nums[1] = false;
        for (int i = 2; i * i <= n; i++) {
            for(int j =2*i ; j<=n ; j+=i){
                nums[j] = false;
            }
        }
        return nums;
    }
}
