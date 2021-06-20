package com.akanksha.RecursionAndBacktracking;

public class GridPath {
    public static void main(String[] args) {
        // move from starting to end of grid but only in right or bottom direction
        int n = 2;
        int m = 5;
        System.out.println(path(n,m));
    }

    private static int path(int n, int m) {
        if(n==1 || m == 1){
            return 1;
        }
        return path(n,m-1)+path(n-1,m);
    }
}
