package com.akanksha.class2;

import java.util.Arrays;

public class SearchAnElement {
    public static void main(String[] args) {
        int[] nums = {3,4,2,6,7,8,10};
        // Linear Search
        int elt =4;
        int ind = LinearSearch(nums,elt);
        System.out.println(Arrays.toString(nums));
        System.out.println(ind);
        }

    public static int LinearSearch(int[] nums, int elt) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==elt){
                return i;
            }
        }
        return -1;
    }
}

