package com.akanksha.class2;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums ={1,4,2,5,3,6};
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void insertionSort(int[] nums) {
        for(int i =0;i<nums.length-1;i++){
            for(int j= i+1;j>0;j--){
                if(nums[j]<nums[j-1]) {
                    swap(nums, j, j - 1);
                }else{
                    break;
                }
            }
        }
    }

    public static void swap(int[] nums, int j, int i) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
}
