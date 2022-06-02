package com.aditya.dp;

import java.util.Arrays;

public class MaxProduct {
        // DO NOT MODIFY THE LIST. IT IS READ ONLY
        static int DP[];
        static int A[]={1,2,3,-5,0};
    public static void main(String[] args) {
        DP=new int[A.length+1];
        Arrays.fill(DP,-101);
        DP[0]=0;
        if(A.length==1)
            System.out.println(A[0]);
        System.out.println("Calling method ");
        System.out.println(product(A,A.length-1));
        for (Integer ele:DP)
            System.out.println(ele+"  ");
    }

        public static int product( int [] A,int idx) {
            if (DP[idx] != -101)
                return DP[idx];
            DP[idx] = Math.max(DP[idx - 1] * A[idx], A[idx]);
             return DP[idx];

        }
}
