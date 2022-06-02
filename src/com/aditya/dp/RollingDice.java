package com.aditya.dp;

public class RollingDice {
    static int ans=0;
    public static void main(String[] args) {

        solve(1,4);
        System.out.println(ans);
    }
    public static void solve(int idx,int sum)
    {
       if(sum==0) {
           System.out.println(idx+","+sum);
           ans++;
       }
       for(int i=idx;i<=sum;i++)
       {
           if(i<=sum) {
               System.out.println(idx+","+sum);
               solve(idx, sum - i);
           }
       }

    }
}
