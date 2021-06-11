package com.akanksha.class2;

import java.util.Arrays;

public class MultiDArray {
    public static void main(String[] args) {
        int[][] nums = new int[5][];
       int[] arr = new int[5];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = new int[i+1];
        }
        int [][] nums1 ={
                {1,2,3,4},
                {2,3,4,5},
                {5,3,2,7}
        };
        // print array
        for (int i = 0; i < 3; i++) {
            for(int j=0;j<4;j++){
                System.out.print(nums1[i][j]+" ");
            }
            System.out.println();
        }

       System.out.println(Arrays.toString(nums));
       System.out.println(Arrays.deepToString(nums1));
       System.out.println(Arrays.toString(arr));
        System.out.println(-4%3);
    }
}

