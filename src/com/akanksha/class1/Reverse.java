package com.akanksha.class1;

public class Reverse {
    public static void main(String[] args) {
        int num = 98756;
        int rev = reverse(num);
        System.out.println(rev);
    }

    private static int reverse(int num) {
        int res =0;
        while(num!=0){
            int rem = num % 10;
            num = num/10;
            res = res*10 + rem;
        }
        return res;
    }
}
