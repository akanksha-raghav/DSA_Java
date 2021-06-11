package com.akanksha.class2;

public class BinarySearch {
    public static void main(String[] args) {
        int [] nums = {2,3,4,6,8,9}; //sorted array
        int elt = 4;
        int ind = BinarySearchElt(nums,elt);
        System.out.println(ind);
    }

    public static int BinarySearchElt(int[] nums, int elt) {
        int start =0;
        int end = nums.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]==elt){
                return mid;
            }else if(nums[mid]<elt){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}
