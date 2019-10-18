/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso8;

import java.util.ArrayList;
import java.lang.*;

/**
 *
 * @author DAC_125
 */
public class Quicksort {

    public static void quickSortx(ArrayList<Coords> arr, int start, int end) {
        int i = start;
        int j = end;
        int index;
        Coords tmp = new Coords();
        if (((start + end) / 2) % 2 == 0) {
            index = (start + end) / 2;
        } else {
            index = (start + end + 1) / 2;
        }
        //System.out.println(index);
        int pivot = arr.get(index).getX();
        while (i <= j) {
            
            while (arr.get(i).getX() < pivot) {
                i++;
            }
            while (arr.get(j).getX() > pivot) {
                j -= 1;
            }
            if (i <= j) {
                
                tmp.setX(arr.get(i).getX());
                tmp.setY(arr.get(i).getY());

                
                arr.get(i).setX(arr.get(j).getX());
                arr.get(i).setY(arr.get(j).getY());

                
                arr.get(j).setX(tmp.getX());
                arr.get(j).setY(tmp.getY());

                i++;
                j--;

            }
            
           
           // System.out.println(f);
            if (start < j){
                 quickSortx(arr, start, j);
            }
            if (i < end){
                quickSortx(arr,i,end);
            }
        }
    }
    
    
    
    
    public static void quickSorty(ArrayList<Coords> arr, int start, int end) {
        int i = start;
        int j = end;
        int index;
        Coords tmp = new Coords();
        if (((start + end) / 2) % 2 == 0) {
            index = (start + end) / 2;
        } else {
            index = (start + end + 1) / 2;
        }
        //System.out.println(index);
        int pivot = arr.get(index).getY();
        while (i <= j) {
            
            while (arr.get(i).getY() < pivot) {
                i++;
            }
            while (arr.get(j).getY() > pivot) {
                j -= 1;
            }
            if (i <= j) {
                
                tmp.setX(arr.get(i).getX());
                tmp.setY(arr.get(i).getY());

                
                arr.get(i).setX(arr.get(j).getX());
                arr.get(i).setY(arr.get(j).getY());

                
                arr.get(j).setX(tmp.getX());
                arr.get(j).setY(tmp.getY());

                i++;
                j--;

            }
            
           
           // System.out.println(f);
            if (start < j){
                 quickSorty(arr, start, j);
            }
            if (i < end){
                quickSorty(arr,i,end);
            }
        }
    }
    
    
    
    
    
    
           

}
