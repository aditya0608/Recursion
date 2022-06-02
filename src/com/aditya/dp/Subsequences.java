package com.aditya.dp;

import java.util.ArrayList;
import java.util.List;

public class Subsequences {
    static String A="adi";
    static List<String> ans;
    public static void main(String[] args) {
        ans=new ArrayList<String>() ;
        subsequences(0,"");
        System.out.println(ans.size());
        for(String list:ans){
                System.out.println(list+"  ");
        }
    }
    public static void subsequences(int idx,String temp)
    {
        if(idx==A.length())
        {
            ans.add(temp);
            return ;
        }
        subsequences(idx+1,temp+A.charAt(idx));
        subsequences(idx+1,temp);

    }
}
