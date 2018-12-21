package com.sgf.user.testJava;

import java.util.Arrays;

/**
 * Created by yuers on 2018/9/27.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int a[] = {2,4,6,8,3,9,10};
        int bb[] = {9,1,5,8,3,7,4,6,2};

        System.out.println(Arrays.toString(bb));
        //sort(bb);
        //aa(bb);
        //simpleSort(bb);
        insertSort(bb);
        System.out.println(Arrays.toString(bb));
    }

    public static void aa(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void sort(int arr[]){
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void simpleSort(int arr[]){
        for (int i=0;i<arr.length-1;i++){
            int min = 0;
            for (int j=i+1;j<arr.length;j++){
                if (arr[min]>arr[j]){
                    min = j;
                }
            }
            if (i!=min){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }


    public static void insertSort(int arr[]){
        for (int i=1;i<arr.length;i++){
            int temp = arr[i];
            int j;
            for(j=i-1;j>=0 && arr[j]>temp;j--){
                arr[j+1] = arr[j];
            }
            arr[j+1] = temp;
        }
    }


}
