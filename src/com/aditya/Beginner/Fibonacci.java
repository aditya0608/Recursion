package com.aditya.Beginner;

/**
 * Here in fibonacci problems we use divide and conquer
 * the nth fib term is a sum of (n-1)th + (n-2)th term
 * f(n)=f(n-1)+f(n-2)
 * Base condition is when we already know the answer i.e. for n=1 ,ans=1 & for n=0 ,ans =0;
 * Time complexity is linear O(n)
 * Space complexity is the stack space used which is max the number itself as we reduce by min 1 each time so height of recursion
 * tree is n 0(n)
 *           DRY RUN
 *           4
 *        3     2
 *      2  1   1  0
 *    1 0
 *    This is the sample binary tree for n=4 height=4 here
 */
public class Fibonacci {

    public static void main(String[] args) {
        int n=5;

        fibonacci(n);
    }

    public static int fibonacci(int n)
    {
        if(n<=1) return n;


       return fibonacci(n-1)+fibonacci(n-2);

    }
}
