package com.geek;

public class MoveZero {

    public static void moveToZero(int[] arr){
        int n = arr.length;
        int j =0; //index of non-zero element

        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] =arr[j];
                arr[j]=temp;
                j++;
            }
        }


    }

    public static void main(String[] args) {

        int[] arr = {1,5,0,3,0,0,4};

        moveToZero(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }
}
