package com.akanksha.RecursionAndBacktracking;

public class StringRecur {
    public static void main(String[] args) {
        String str = "abcd";
        subseq(str,"");
    }

    private static void subseq(String unproc, String proc) {
        // base condition
        if(unproc.isEmpty()){
            System.out.println(proc);
            return;
        }
        char ch = unproc.charAt(0);
        unproc = unproc.substring(1);
        subseq(unproc,proc+ch);
        subseq(unproc,proc);
    }
}
/* complexity = depth of tree */