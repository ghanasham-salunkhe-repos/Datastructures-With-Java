package com.ghanasham.sampleProject.SortingAlgorithms;

public class SelectionSort {

//    int bubble sort we will swapp the values multiple times
    // and while swapping we will move the biggest value to last
    // insertion sort provide much better approach for that
    // we will find biggest or smallest value & we will switch accordingly
    public static int[] selectionSortMoveMinToLast(int[] array){

        for (int i = 0; i < array.length; i++) {
            int index=i;
            for (int j = i+1; j < array.length; j++) {
                if (array[index]>array[j]){
                    index=j;
                }
            }
            int temp=array[i];
            array[i]=array[index];
            array[index]=temp;
        }

        return array;
    }

    public static int[] selectionSortMoveMaxToLast(int[] array){

        for (int i = array.length-1; i >=0; i--) {
            int index=i;
            for (int j =0; j < i; j++) {
                if (array[index]<array[j]){
                    index=j;
                }
            }

            int temp=array[i];
            array[i]=array[index];
            array[index]=temp;
        }

        return array;
    }

    public static void main(String[] args) {
        int[] array1 = { 97,23,6,13,34,54,69,99,10,85,72,53};
        System.out.println("\ninitial array :");
        printArray(array1);

//        array1=selectionSortMoveMinToLast(array1);
        array1=selectionSortMoveMaxToLast(array1);
        System.out.println("\n\ninserted array :");
        printArray(array1);
    }

    public static void  printArray(int[] array){
        for (int i : array) {
            System.out.print(i+" ");
        }
    }
}
