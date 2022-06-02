package com.aditya.dp;

public class TillingProblem {

    static int rows=4;
    static int column=4;
    public static void main(String[] args) {
        System.out.println( till(column));
    }
    static int till(int N)
    {
        if(N<=3)
            return 1;
        /*take 1"" 4"'
        problem reduces to
        */


        return till(N-1)+till(N-4);
    }
}
