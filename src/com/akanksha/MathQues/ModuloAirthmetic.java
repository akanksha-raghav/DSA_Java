package com.akanksha.MathQues;

public class ModuloAirthmetic {
    public static void main(String[] args) {
        System.out.println(fastPower(3234972,5 , 1000000007));
    }
// to get rid of int or long overflow
    private static long fastPower(long a, long b, int n) {
        long res =1;
        while(b>0){
            if((b&1) !=0){    //b%2!=0
                res = (res * a % n) %n;
            }
            a = (a % n * a % n) % n;
            b = b>>1 ;    //b = b/2
        }
        return res;
    }

}
