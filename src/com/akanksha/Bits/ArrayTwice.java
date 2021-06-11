package com.akanksha.Bits;

public class ArrayTwice {
    public static void main(String[] args) {
        int[] nums = {5,4,1,4,3,5,1};
        int res =nums[0];
        for(int i=0;i<nums.length-1;i++){
            res = res ^ nums[i+1];
        }
        System.out.println(res);
    }
}
