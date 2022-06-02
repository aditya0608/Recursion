package com.aditya.dp;

public class MaxZeroesSubstring {
    static String A="0101";
    static int countZeroes=0;
    static int ans=0;
    static int ansN=0;
    public static void main(String[] args) {
        System.out.println(solve(0,0));
        System.out.println(countZeroes);
    }
    public static int solve(int idx,int countZeroes)
    {
        if(idx==A.length())
            return 0;
        if(A.charAt(idx)==0)
        ans+=solve(idx+1,countZeroes+1);
        if (A.charAt(idx)==1)
        ansN+=solve(idx+1,countZeroes);
        return  Math.max(ans,ansN);

    }
}
