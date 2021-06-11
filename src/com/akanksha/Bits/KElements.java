package com.akanksha.Bits;
public class KElements {
    public static void main(String[] args) {
        int a[] = { 6, 2, 5, 2, 2, 6, 6 };
        int n = a.length;
        int k = 3;
        System.out.println(findUnique(a, n, k));
    }
    static int findUnique(int a[], int n, int k) {
        byte sizeof_int = 4;
        int INT_SIZE = 8 * sizeof_int;
        int count[] = new int[INT_SIZE];
        for (int i = 0; i < INT_SIZE; i++)
            for (int j = 0; j < n; j++)
                if ((a[j] & (1 << i)) != 0)
                    count[i] += 1;
        int res = 0;
        for (int i = 0; i < INT_SIZE; i++)
            res += (count[i] % k) * (1 << i);
        return res;
    }
}
