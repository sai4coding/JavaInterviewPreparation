package com.java.interviewPreparation;

public class NoofDigits {

    public static void main(String[] args){
        int num=12734;
        int count=0;
        while(num!=0){
            num=num/10;
            count++;
        }
        System.out.println("No of digits:"+count);
    }
}
