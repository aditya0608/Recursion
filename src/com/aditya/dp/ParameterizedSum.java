package com.aditya.dp;

public class ParameterizedSum
{
    static int A=5;

    public static void main(String[] args) {
        sum(A,0);
    }
    public  static void    sum(int A,int sum)
    {
        if(A<0) {
            System.out.println(sum);
            return;
        }
         sum(A-1,sum+A);
    }
}
