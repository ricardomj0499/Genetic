/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso8;

/**
 *
 * @author DAC_125
 */
public class Quicksort {
        public static void quickSortx(int[] arr, int start, int end){
 
        int partition = partition(arr, start, end);
 
        if(partition-1>start) {
            quickSortx(arr, start, partition - 1);
        }
        if(partition+1<end) {
            quickSortx(arr, partition + 1, end);
        }
    }
 
    public static int partition(int[] arr, int start, int end){
        int pivot = arr[end];
 
        for(int i=start; i<end; i++){
            if(arr[i]<pivot){
                int temp= arr[start];
                arr[start]=arr[i];
                arr[i]=temp;
                start++;
            }
        }
 
        int temp = arr[start];
        arr[start] = pivot;
        arr[end] = temp;
 
        return start;
    }
}
