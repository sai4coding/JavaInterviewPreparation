package com.java.interviewPreparation;

public class ReversingSentence {
    public static void main(String[] args) {
        String st="hi hello welcome to my channel";
        String ReverseWord[]=st.split(" ");
        for(int i=ReverseWord.length-1;i>=0;i--){
            System.out.print(ReverseWord[i] +" ");
        }
    }


}
