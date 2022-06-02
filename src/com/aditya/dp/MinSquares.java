package com.aditya.dp;

import java.util.Arrays;
import java.util.Scanner;

public class MinSquares {

    static int memoize[];
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        memoize=new int[N+1];
        Arrays.fill(memoize,-1);
        memoize[0]=0;
        System.out.println(minSquares(12));

    }
    private static int  minSquares(int N) {
        if(memoize[N]!=-1)
            return memoize[N];
        for(int i=1;i<=Math.sqrt(N);i++)
        {
            if(memoize[N]==-1)
                memoize[N]=N;
            memoize[N]=Math.min(minSquares(N-i*i)+1,memoize[N]);
        }
        return memoize[N];

    }
}
