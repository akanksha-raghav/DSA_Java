package com.akanksha.class2;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {2,1,5,3,7,4};
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int max = maxElement(nums,0,nums.length-i);
            swap(nums, max, nums.length - 1 - i);
        }
    }
    public static int maxElement(int[] nums,int ind1,int ind2) {
        int max = ind1;
        for (int i = ind1; i < ind2; i++) {
            if(nums[i] > nums[max]) {
                max = i;
            }
        }
        return max;
    }
    public static void swap(int[] nums, int j, int i) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp ;
    }
}
