package com.aditya.backtracking;

/**
 * The problem statement is build on top of finding all subsets then for each subset calculate xor and find sum of all such combinations
 * Ex: [1,2,3]
 * Subsets
 * [1],[2],[3],[1,2],[1,3],[1,2,3],[2,3]
 * Xor's
 * [1],[2],[3],[3],[2],[0],[]
 * Sum= 1+2+3+1+2+1+1=>12
 *
 * Simple Approach is either an element can be in a subset or cannot be in a subset
 * The problem is solved by take it or it leave it approach
 *
 *              [1,2]
 *           [1]      [2]
 *      [1,2]  [1]     [2]
 *
 *--------------AllSubsets are found at leaf nodes------------------
 */
public class AllSubsetXorSum {


    public static void main(String[] args) {
        int nums[]={1,2,3};
        System.out.println(2^3);
        int totalSum= subsetSum(nums,0,0);
        System.out.println(totalSum);
    }
    public static int subsetSum(int []nums,int idx,int xor)
    {
        if(idx==nums.length) return xor;

        int withElement=subsetSum(nums,idx+1,xor^nums[idx]);

        int wihoutElement=subsetSum(nums,idx+1,xor);

        return withElement+wihoutElement;
    }
}
