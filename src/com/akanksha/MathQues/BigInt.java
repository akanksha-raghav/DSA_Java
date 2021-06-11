package com.akanksha.MathQues;

import java.math.BigInteger;

public class BigInt {
    public static void main(String args[]) throws Exception {
        // https://www.geeksforgeeks.org/biginteger-class-in-java/
        int N = 30;
        System.out.println(factorial(N));
        BigInteger A = BigInteger.ONE;
        BigInteger B = BigInteger.TEN;
        BigInteger C = A.add(B); // same for subtract,multiply,divide,remainder
        System.out.println(C);
        String str ="123456789";
        BigInteger C1 = A.add(new BigInteger(str));
        int val  = 123456789;
        BigInteger C2 = A.add(BigInteger.valueOf(val));

    }
    public static BigInteger factorial(int N) {
        BigInteger fact = new BigInteger("1");
        for (int i = 2; i <= N; i++)
            fact = fact.multiply(BigInteger.valueOf(i));

        return fact;
    }
}

