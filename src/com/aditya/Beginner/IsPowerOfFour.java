package com.aditya.Beginner;

/**
 * This problem is mainly dealing with edge cases
 * We keep on dividing the number unless it becomes 1
 * Case 1: If the number becomes 1 it is a power of 4
 * Case 2: If the number%4!=0 it is not a power :Make sure not to add this condition at the top as it will fail for n=1
 * Case 3: If n=0 return false implies in previous level n>=0 && n<=3 :0,1,2,3 are not powers of 4
 * Time complexity is logbase4(N): for 16 ->16->4->1 just two iterations not(N/4) which is 4 iterations
 * Space Complexity is logbase4(N) As we divide the number by 4 all times
 * N-> N/4 -> N/8 ...... 1 till the number becomes 1
 * So the last term 1 is (N/4^k)=1;
 *                        N=4^k;
 * Take log on both sides logbase4N=k;
 *
 */
public class IsPowerOfFour {

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(11));
    }

    public static boolean isPowerOfFour(int n)
    {
        if(n==0) return false;
        if(n==1) return  true;

        if(n%4!=0) return  false;
        return isPowerOfFour(n/4);
    }
}
