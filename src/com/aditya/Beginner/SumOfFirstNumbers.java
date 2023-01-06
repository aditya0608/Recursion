package com.aditya.Beginner;

/**
 * The sum of N Numbers can be solved by forming the following recurrence relationship
 * S(N)=N+S(n-1) : which means the sum of N Numbers is equal to the sum of The number N+S(N-1) numbers
 * Base Condition occurs always for know values which are S(0)=0 & S(1)=1
 * Time complexity is linear O(N)
 * Space Complexity is height of tree and since decrement is by 1 each time the leaf node will be at a distance of N from source
 * hence 0(N)
 *       DRY RUN
 *         S(3)
 *         3+S(2)
 *            2+S(1)
 */
public class SumOfFirstNumbers {

    public static void main(String[] args) {

        System.out.println(sumOfFirstXNumbers(-1));
    }

    public static int sumOfFirstXNumbers(int n)
    {
        if(n<0)
        {
            System.out.println("Invalid Input ");
            return -1;
        }
        if(n<=1) return n;

        return n+sumOfFirstXNumbers(n-1);
    }
}
