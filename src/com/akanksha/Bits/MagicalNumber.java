package com.akanksha.Bits;

public class MagicalNumber {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(magicNumber(n));
    }
// A magic no is defined as a no which can be expressed as a power of 5 or sum of unique powers of 5
    // 001,010,011,100,101,110.... add power 5 of eah bit set in given integer
    // 5^1 , 5^2, (5^2+5^1), (5^3)....
    private static int magicNumber(int n) {
        int place = 5, res = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                res = res + place;
            }
            place *= 5;
            n = n >> 1;
        }
        return res;
    }
}
