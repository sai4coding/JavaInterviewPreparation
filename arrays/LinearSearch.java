package com.dsa.arrays;

public class LinearSearch {
    public static void main(String[] args){
        int[] a={1,2,3,4,5};
        int target=4;
        int size=a.length;
        for(int i=0;i<size;i++) {
            if (a[i] == target) {

                  System.out.println(a[i] +" found at index" +i);
            }

        }
    }
}
