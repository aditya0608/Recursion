package com.aditya.dp;

public class IncreasingDecreasing {

    public static void main(String[] args) {
        function(5,1);
    }
    public static void function(int num,int count)
    {
       if(num==0)
       {
           return ;

       }
            System.out.println(num);
       //jo kaam function call se pehley ho vo head recursion
            function(num-1,count);
            //baad vaala tail recursion yeh return ke baad execute hoga
        System.out.println(num);

    }
}
