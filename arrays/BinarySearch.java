package com.dsa.arrays;



public class BinarySearch {
    public static void main(String[] args){
        int[] a={3,1,6,9,2,7,10,11,98};
        int left=0;
        int right=a.length-1;
        int target =7;
        while(left<=right){
            int mid=(left+right)/2;
            if (a[mid]==target){
                System.out.println(a[mid]);
                return;
            } else if (a[mid]<target) {
                left=mid+1;

            }
            else{
                right=mid-1;
            }
        }
    }
}
                               //2nd Approach



class Binary{
    int a[]={1,2,3,4,5};
    int target=3;
    int size=a.length-1;
    public int  binarySearch(int target){
        for(int i=0;i<size;i++){
            if(a[i]==target){
                System.out.println(a[i] +"found at index" +i);
            }
        }


        return target;
    }
}
class BinarySearch{
    public static void main(String[] args) {
        Binary b=new Binary();
        b.binarySearch(3);
    }
}
