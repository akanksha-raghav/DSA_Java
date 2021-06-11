package com.akanksha.class1.patterns;

public class PattBasic {
    public static void main(String[] args) {
        //square(5);
        //upTriangle(5);
        //downTriangle(5);
        sep(8,2);
    }
    public static void square(int n){
        int row = 0;
        while (row < n) {
            int col = 0;
            while (col < n) {
                System.out.print("* ");
                col++;
            }
            System.out.println();
            row++;
        }
    }

    public static void upTriangle(int n){
        int row = 0;
        while (row < n) {
            int col = 0;
            while (col <= row) {
                System.out.print("* ");
                col++;
            }
            System.out.println();
            row++;
        }
    }

    public static void downTriangle(int n){
        int row = 0;
        while (row < n) {
            int col = 0;
            while (col < n - row) {
                System.out.print("* ");
                col++;
            }
            System.out.println();
            row++;
        }
    }

    public static void sep(int n, int row){
        int col = 0;
        while (col < n - row) {
            System.out.print("* ");
            col++;
        }
        System.out.println();
    }
}
