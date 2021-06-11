package com.akanksha.class2;

public class MaxElement {
    public static void main(String[] args) {
        int[] nums ={2,3,41,6,7,8,9};
        int ind = maxElement(nums);
        System.out.println("Maximum index is "+ind);
    }

    public static int maxElement(int[] nums) {
        int maxInd = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[maxInd]<nums[i]){
                maxInd = i ;
            }
        }
        return maxInd;
    }
}
