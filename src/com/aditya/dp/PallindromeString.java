package com.aditya.dp;

public class PallindromeString {

    static String A="NAMAN";
    static String B="NAMAN";
    static String temp="";
    public static void main(String[] args) {
        System.out.println(String.valueOf(checkPallindrome(B.length()-1)));
        //System.out.println(checkPallindrome(B.length()-1);
    }
    public  static boolean checkPallindrome(int idx)
    {
        if(B.length()-1-idx>=idx)
            return true;
        if(B.charAt(idx)!=B.charAt(B.length()-1-idx))
        {
                return false;
        }
         return  checkPallindrome(idx-1);
    }
}
