package com.akanksha.StringQues;

public class MinimumCost {
    public static void main(String[] args) {
        String str = "abab";
        System.out.println(minCost(str.toCharArray()));
    }

    private static int minCost(char[] str) {
        boolean[] alphabets = new boolean[26];
        for (int i = 0; i < str.length; i++)
            alphabets[(int)str[i] - 97] = true;
        int count = 0;
        for (int i = 0; i < 26; i++)
        {
            if (alphabets[i])
            {
                count++;
            }
        }
        return count;
    }
}
