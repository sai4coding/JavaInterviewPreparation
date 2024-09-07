package com.java.interviewPreparation;

public class ReversingString {
    public static void main(String[] args){

        String st="hello";
        String reverseString=" ";
        System.out.println(st  +"before reversing a String");
        char ch;

        for(int i=0;i<st.length();i++){
            ch=st.charAt(i);
            reverseString=ch+reverseString;
        }
        System.out.println(reverseString +"after reversing a string");

    }


}
