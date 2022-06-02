package com.aditya.dp;

import java.util.ArrayList;
import java.util.List;

public class SumSubsequence {
    static ArrayList<Integer> A=new ArrayList<>();
    static ArrayList<ArrayList<Integer>> ans;
    static int K=6;
    static ArrayList<Integer> temp;
    public static void main(String[] args) {
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(6);
        A.add(2);
        A.add(2);



        temp=new ArrayList<>();
        ans=new ArrayList<ArrayList<Integer>>();
        subsequences(0,6,temp,ans);
        //System.out.println(ans);

        for(ArrayList<Integer> list:ans){
            System.out.println(list+"  ");
        }
    }
    public static void subsequences(int idx,int sum,ArrayList<Integer> temp,ArrayList<ArrayList<Integer>> ans)
    {
        //System.out.println(ans+ " "+ans.size());
        if(idx==A.size())
        {
            if(sum==0) {
                ArrayList<Integer> temp2=(new ArrayList<>());
                for(Integer ele:temp)
                {
                    temp2.add(ele);
                }
                ans.add(temp2);
               // System.out.println(sum+"   "+ans+ " "+ans.size());
            }
            return ;
        }
        temp.add((A.get(idx)));
        subsequences(idx+1,sum-A.get(idx),temp,ans);
        temp.remove(temp.size()-1);
        subsequences(idx+1,sum,temp,ans);

    }
}
