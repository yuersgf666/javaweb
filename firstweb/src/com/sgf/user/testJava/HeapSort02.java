package com.sgf.user.testJava;

/**
 * Created by yuers on 2018/10/9.
 */
public class HeapSort02 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 8, 7, 2, 3, 4, 9};
        heapSort(arr);
    }

    public static void heapSort(int arr[]){
        //数组最后一位下标值
        int n = arr.length-1;
        //构造大顶堆，从下往上构造
        //i为最后一个根节点，n为数组最后一个元素的下标
        for (int i=(n-1)/2;i>=0;i--){
            int temp = arr[i];
            for (int j=i*2;j<=arr.length;j=j*2){
                //如果左孩子大于右孩子，就让i指向右孩子
                if (j<arr.length && arr[j]<arr[j+1]){
                    j++;
                }
                //如果父节点大于或者等于较大的孩子，那就退出循环
                if (temp>=arr[j]){
                    break;
                }
                //如果父节点小于孩子节点，那就把孩子节点放到父节点上
                arr[i] = arr[j];
                i=j;
            }
            arr[i] = temp;
        }
    }
}
