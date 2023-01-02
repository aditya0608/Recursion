package com.aditya.dp;

public class Testing {
    static int a=5;

    public static void main(String[] args) {
        //recurse(a);
        //System.out.println(sum(10));
        System.out.println(factorialHeadRecursion(10000));
        System.out.println(factorialTailRecursion(10000,1));
    }
    static void recurse(Integer ele)
    {
        ele=3;
        //System.out.println(ele++);
        recurse(ele);
    }
    //recursive calculation of sum
    public static int sum (Integer ele )
    {
        //base condition
        if(ele==1) return 1;

        //break sum as ele+sum(biggerProblem-1);
        return ele+sum(ele-1);
    }
    //stack overflow tail recursion factrorial
    public static long factorialHeadRecursion(int N)
    {
        if (N==1) return 1;

        /*
        same as
        int fact=fact(N-1); // first recursion call is made
        int result=N*result; // Then the results are calculated and returned
        return result;
         */
        return N*factorialHeadRecursion(N-1);
    }
    //avoidStack overflow
    public static  long factorialTailRecursion(int N,int result)
    {
        if(N==1) return result;
        //here first calculation is done result*N then recursion takes place

        return factorialTailRecursion(N-1,result*N);
    }

}
