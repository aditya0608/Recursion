package com.aditya.dp;

public class ReturnTut {
    static int a=0;

    public static void main(String[] args) {
        System.out.println(solve(1));
    }
    public  static int solve(int idx)
    {
        if(idx>5)
            return 0;
        if(idx%2==0)
            return a=1+solve(idx+2);
        return a=Math.max(1+solve(idx+1),2+solve(idx+1));

    }
}
