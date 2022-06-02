package com.aditya.dp;

import java.util.Arrays;

public class WaysToDecode {
    static String A="2611055971756562";
    static int ways=0;
    static int memoize[]=new int[A.length()];
    public static void main(String[] args) {
        Arrays.fill(memoize,-1);
        System.out.println(solve (0));
        System.out.println(System.getProperty("java.class.path"));
    }
    public static int solve(int idx)
    {
        if(idx==A.length()) {
            return 1;
        }
        int a=0,b=0;
        if(memoize[idx]!=-1)
            return memoize[idx];
        //select one char
        if(A.charAt(idx)>'0')
        //ways=solve(idx+1);
        a=solve(idx+1);

        //select two chars
        if(idx+1<A.length())
        {
            if(A.charAt(idx)=='1' || A.charAt(idx)=='2' && A.charAt(idx)<'7')
            {
                //ways+=solve(idx+2);
                b=solve(idx+2);
            }
        }
        //memoize[idx]=ways;
        memoize[idx]=a+b;
        return memoize[idx];
    }
}
