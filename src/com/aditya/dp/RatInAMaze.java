package com.aditya.dp;

import java.util.HashMap;
import java.util.Map;

public class RatInAMaze {
    static int [][]matrix={{1,1,1},{1,1,1},{0,1,1}};
    static int dirs[][]={{0,1},{1,0},{0,-1},{-1,0}};
    static char dirsCharacter[]={'R','D','L','U'};
    static int ans=0;
    static int visited[][]=new int[3][3];
    public static void main(String[] args) {
        solve(0,0,"");
        System.out.println(ans);
    }
    public static  void solve(int row,int col,String temp)
    {
        visited[row][col]=1;
        if(row==2 && col==2 && matrix[row][col]==1)
        {
            ans++;
            System.out.println(temp);
            return;
        }
        for(int i=0;i<dirs.length;i++)
        {
            if(isValid(row+dirs[i][0],col+dirs[i][1]) && matrix[row+dirs[i][0]][col+dirs[i][1]]==1 && visited[row+dirs[i][0]][col+dirs[i][1]]==0)
            {

                solve(row+dirs[i][0],col+dirs[i][1],temp+dirsCharacter[i]);
                visited[row+dirs[i][0]][col+dirs[i][1]]=0;
            }
        }
    }
    public static boolean isValid(int row,int col)
    {
        if(row<0 || col<0 || row>=3 || col>=3)
        {
         return  false;
        }
        return true;
    }
}
