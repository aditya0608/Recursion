package com.aditya.dp;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicates {

    //yeh map main store karna hai character hai ki nahi ,duplicacy dekhney ke liye
    static Map<Character,Boolean> map=new HashMap<>();
    //yeh nayi string jo banani hai
    static String newString="";
    public static void main(String[] args) {
        String s="axbcxxd";
        removeDuplicates(s,0);
        System.out.println(newString);
    }
    public static void removeDuplicates(String s,int idx)
    {
        //agar string poori naap do toh vaapis ho lo
        if(idx==s.length())
            return ;
        //agar map main already nahi hai character toh nayi string main daalo vo character
        //nahi hai toh map.get(character) kroonga toh null aayega kyunki character hai hi nahi mtlb pehli
        //baar aaraha hai
        if(map.get(s.charAt(idx))==null) {
            newString += s.charAt(idx);
            //string main add krdo agar nahi hai toh
        }
        //ab add krney ke baad map main add krdo taaki agley baar aaye toh add na ho
        //map.put se
        map.put(s.charAt(idx),true);
        //ab agleye character ke liye idx+1 krdo
        removeDuplicates(s, idx + 1);


    }
}
