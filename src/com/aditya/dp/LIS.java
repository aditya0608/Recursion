package com.aditya.dp;

import java.util.Arrays;

public class LIS {
    static int array[];
    static int memoize[];
    public static void main(String[] args) {
        array=new int[]{1,2,5,4,3};
        memoize=new int[array.length];
        Arrays.fill(memoize,1);
        memoize[0]=1;
        solve(array.length-1);
        for(Integer ele:memoize)
            System.out.print(ele+"  ");
    }
    public  static int solve(int idx)
    {

            if(array[idx-1]<array[idx]) {
                memoize[idx]=Math.max(memoize[idx],1+solve(idx-1) );

            }

        return  memoize[idx];
    }

}
