package com.aditya.dp;

import java.util.ArrayList;

public class Permutations {

    static String A="123";
    static String temp="";
    static ArrayList<Integer> Al=new ArrayList<>();
    static ArrayList<String> ans=new ArrayList<>();
    static ArrayList<Integer> loop=new ArrayList<>();
    static int product=-Integer.MAX_VALUE;
    static ArrayList<ArrayList<Integer>> ansL=new ArrayList<>();
    public static void main(String[] args) {
        Al.add(1);
        Al.add(5);
        Al.add(-3);
        Al.add(4);
        Al.add(-2);

        // permutations(0,temp);
        infinite(0,loop,2,1,-1);
        for(String ele: ans)
            System.out.println(ele);
        for(ArrayList<Integer> ele:ansL)
            System.out.println(ele);
        System.out.println(product);
    }
    public static void infinite(int idx,ArrayList<Integer> loop,int B,int C,int D)
    {
        if(idx==3)
        {
            ArrayList<Integer>  inside=new ArrayList<>(loop);
            ansL.add(inside);
                int b=B*inside.get(0);
                int c=C*inside.get(1);
                int d=D*inside.get(2);
            product=Math.max(product,b+c+d);
            return;
        }
        for(int i=0;i<Al.size();i++)
        {
            loop.add(Al.get(i));
                infinite(idx+1,loop,B,C,D);
                loop.remove(loop.size()-1);

        }
    }
    public static void permutations(int idx,String temp)
    {
        if(idx==A.length())
        {
            String inside="";
            for(int i=0;i<temp.length();i++)
            {
                inside+=temp.charAt(i);
            }
            ans.add(inside);
            return;
        }
        for(int i=0;i<A.length();i++)
        {
            if(!contains(temp,A.charAt(i)))
            {
                permutations(idx+1,temp+A.charAt(i));
            }
        }
    }
    public static boolean contains(String temp,char c)
    {
        for(int i=0;i<temp.length();i++)
        {
            if(c==temp.charAt(i))
                return true;
        }
        return false;
    }
}
