/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso8;

import java.util.ArrayList;

/**
 *
 * @author DAC_125
 */
public class Quicksort {

    public static void quickSortx(ArrayList<Coords> arr, int start, int end) {

        int partition = partitionx(arr, start, end);

        if (partition - 1 > start) {
            quickSortx(arr, start, partition - 1);
        }
        if (partition + 1 < end) {
            quickSortx(arr, partition + 1, end);
        }
    }

    public static int partitionx(ArrayList<Coords> arr, int start, int end) {
        Coords pivot = arr.get(end);

        for (int i = start; i < end; i++) {
            if (arr.get(i).getX() < pivot.getX()) {
                Coords temp = arr.get(start);
                arr.get(start).setR(arr.get(i).getR());
                arr.get(start).setG(arr.get(i).getG());
                arr.get(start).setB(arr.get(i).getB());
                arr.get(start).setX(arr.get(i).getX());
                arr.get(start).setY(arr.get(i).getY());

                arr.get(start).setR(temp.getR());
                arr.get(start).setG(temp.getG());
                arr.get(start).setB(temp.getB());
                arr.get(start).setX(temp.getX());
                arr.get(start).setY(temp.getY());
                start++;
            }
        }

        Coords temp = arr.get(start);
        arr.get(start).setR(pivot.getR());
        arr.get(start).setG(pivot.getG());
        arr.get(start).setB(pivot.getB());
        arr.get(start).setX(pivot.getX());
        arr.get(start).setY(pivot.getY());

        arr.get(end).setR(temp.getR());
        arr.get(end).setG(temp.getG());
        arr.get(end).setB(temp.getB());
        arr.get(end).setX(temp.getX());
        arr.get(end).setY(temp.getY());

        return start;
    }

    public static void quickSorty(ArrayList<Coords> arr, int start, int end) {

        int partition = partitiony(arr, start, end);

        if (partition - 1 > start) {
            quickSorty(arr, start, partition - 1);
        }
        if (partition + 1 < end) {
            quickSorty(arr, partition + 1, end);
        }
    }

    public static int partitiony(ArrayList<Coords> arr, int start, int end) {
        Coords pivot = arr.get(end);

        for (int i = start; i < end; i++) {
            if (arr.get(i).getY() < pivot.getY()) {
                Coords temp = arr.get(start);
                arr.get(start).setR(arr.get(i).getR());
                arr.get(start).setG(arr.get(i).getG());
                arr.get(start).setB(arr.get(i).getB());
                arr.get(start).setX(arr.get(i).getX());
                arr.get(start).setY(arr.get(i).getY());

                arr.get(start).setR(temp.getR());
                arr.get(start).setG(temp.getG());
                arr.get(start).setB(temp.getB());
                arr.get(start).setX(temp.getX());
                arr.get(start).setY(temp.getY());
                start++;
            }
        }

        Coords temp = arr.get(start);
        arr.get(start).setR(pivot.getR());
        arr.get(start).setG(pivot.getG());
        arr.get(start).setB(pivot.getB());
        arr.get(start).setX(pivot.getX());
        arr.get(start).setY(pivot.getY());

        arr.get(end).setR(temp.getR());
        arr.get(end).setG(temp.getG());
        arr.get(end).setB(temp.getB());
        arr.get(end).setX(temp.getX());
        arr.get(end).setY(temp.getY());

        return start;
    }
}
