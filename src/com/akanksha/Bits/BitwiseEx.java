package com.akanksha.Bits;

public class BitwiseEx {
    public static void main(String[] args) {
        int n = 13;
        System.out.println(isOdd(n));
        System.out.println(countSetBits(n)); //setbits means no of 1's
        int[] nums = {2,7,3,9,2,3,7};
        System.out.println(uniqueI(nums));
    }

    private static int uniqueI(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            ans = ans ^ num;
        }
        return ans;
    }

    private static int countSetBits(int n) {
        int cnt = 0;
        while (n > 0) {
            if((n&1) == 1) {
                cnt++;
            }
            n = n >> 1;
        }
        return cnt;
    }

    private static boolean isOdd(int n) {
        return (n&1) == 1;
    }

}
