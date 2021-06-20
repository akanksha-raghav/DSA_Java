package com.akanksha.RecursionAndBacktracking;

public class PowerRecur {
    public static void main(String[] args) {
        int a = 5;
        int b= 4;
        System.out.println(power(a,b)); //O(n)
        // Fast Power O(logn)
        System.out.println(fast(a,b));
    }

    private static int fast(int a, int b) {
        if(b==0){
            return 1;
        }
        if(b%2==0){
            return fast(a*a,b/2);
        }
        return a* fast(a,b-1);
    }

    private static int power(int a, int b) {
        if(b==0){
            return 1;
        }
        return (power(a,b-1)*a);
    }
}
