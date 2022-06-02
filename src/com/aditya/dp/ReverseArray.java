package com.aditya.dp;

public class ReverseArray {

    public static int A[]={1,2,3,4};
    public static void main(String[] args) {
        reverse(A.length-1);
        for(Integer ele:A)
            System.out.println(ele+" ");
    }
    public static void  reverse(int idx)
    {
       if(A.length-idx-1>=idx)
           return ;

       int num=A[idx];
       A[idx]=A[A.length-idx-1];
       A[A.length-idx-1]=num;
       reverse(idx-1);


    }
}
