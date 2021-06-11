package com.akanksha.MathQues;

public class CatlanNum {
    public static void main(String[] args) {
        // https://www.geeksforgeeks.org/program-nth-catalan-number/
        // Catalan numbers for n = 0, 1, 2, 3, … are 1, 1, 2, 5, 14, 42, 132, 429, 1430, 4862, …
        // Method 1 Recursive approach
        int num =10;
        for(int i=0;i<num;i++){
            System.out.println(catlan(i));
        }
    }
    private static int catlan(int num) {
        int res =0;
        if(num<=1)
            return 1;
        for(int i=0;i<num;i++){
            res = res +(catlan(i)*catlan(num-i-1));
        }
        return res;
    } // This is the worst method to implement catalan no as it's time complexity is exponential.
    // Dynamic approach = O(n^2)
    // Binomial Coefficient O(n) next is using bitinteger.

}
