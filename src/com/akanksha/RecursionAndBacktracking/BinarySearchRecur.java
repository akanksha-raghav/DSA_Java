package com.akanksha.RecursionAndBacktracking;

public class BinarySearchRecur {
    public static void main(String[] args) {
        int[] nums ={2,3,5,6,8,12,15,19};
        int end = nums.length;
        System.out.println(Recurs(nums,12,0,end));
    }

    private static int Recurs(int[] nums, int elt,int start, int end) {
        if(start>end){
            return -1;
        }
        int mid = (start+end)/2 ;
        if(nums[mid]==elt){
            return  mid;
        }
        if(nums[mid]<elt) {
            return Recurs(nums, elt, start + 1, end);
        }
        return Recurs(nums,elt,start,end-1);

    }
}
