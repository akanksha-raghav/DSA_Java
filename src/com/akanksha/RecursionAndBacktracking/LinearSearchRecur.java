package com.akanksha.RecursionAndBacktracking;

public class LinearSearchRecur {
    public static void main(String[] args) {
        int[] nums ={3,4,6,7,9,32,44};
        System.out.println(find(nums,3,0));
    }

    private static boolean find(int[] nums,int elt,int ind) {
        if(ind == nums.length){
            return false;
        }
        if(elt == nums[ind]){
            return true;
        }
        return find(nums,elt,ind+1);
    }
}
