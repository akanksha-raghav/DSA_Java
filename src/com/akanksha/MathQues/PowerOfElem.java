package com.akanksha.MathQues;

public class PowerOfElem {
    public static void main(String[] args) {
        System.out.println(fastPower(3,5));
    }

    private static int fastPower(int a, int b) {
        int res =1;
        while(b>0){
            if((b&1) !=0){    //b%2!=0
                res = res *a;
            }
            a = a*a;
            b = b>>1 ;    //b = b/2
        }
        return res;
    }
}
