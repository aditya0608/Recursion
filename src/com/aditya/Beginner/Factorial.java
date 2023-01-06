package com.aditya.Beginner;

/**
 * This problem can be simply solved by the mathematical formula :)
 * fact(N)=N*Fact(N-1)
 * Base Condition is the known case when N=1 and N=0 factorial=1
 * Time complexity is O(N)
 * Space Complexity is O(N)
 *        DRY RUN
 *        fact(3)
 *        3*fact(2)
 *           2*fact(1)
 *
 */
public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static long factorial(int n)
    {
        if(n<=1 && n>=0) return 1;

        return n*factorial(n-1);


    }
}
