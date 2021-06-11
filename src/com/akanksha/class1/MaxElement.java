package com.akanksha.class1;

import java.util.Arrays;

public class MaxElement {
    public static void main(String[] args) {
        int[] nums = {1,2,3,5,6,9,21,7};
        int maxNum= maximum(nums);
        int minNum= minimum(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("Maximum number: "+maxNum);
        System.out.println("Minimum number: "+minNum);
    }

    private static int minimum(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min = nums[i];
            }
        }
        return min;
    }

    private static int maximum(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        return max;
    }
}
