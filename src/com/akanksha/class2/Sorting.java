package com.akanksha.class2;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] nums ={3,4,2,6,7,1};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void bubbleSort(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-1-i;j++){ //O(n^2)
                if(nums[j]>nums[j+1]){
                    swap(nums,j,j+1);
                }
            }
        }
    }

    public static void swap(int[] nums, int j, int i) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp ;
    }
}
