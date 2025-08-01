package com.ghanasham.sampleProject.SortingAlgorithms;

public class BubbleSort {

    // in each iteration bubble sort try to move biggest value to end of array
    public static int[] bubbleSort(int[] array){
        int value= array.length;

        System.out.println();
        for (int i = 0; i < array.length; i++) {
            printArray(array);
            System.out.println();
            for (int j = 0; j < value-1; j++) {
                if (array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
            value--;
        }
        return array;
    }

    // in each iteration bubble sort try to move biggest value to end of array
    public static int[] bubbleSortEnhanced(int[] array){
        int value= array.length;
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            printArray(array);
            boolean swapped=false;
            System.out.println();
            for (int j = 0; j < value-1; j++) {
                if (array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    swapped=true;
                }
            }
            value--;
            if (!swapped){
                break;
            }
        }
        return array;
    }

    public static void  printArray(int[] array){
        for (int i : array) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {

        int[] array = { 97,23,6,13,34,54,69,99,10,85,72,53};
        int[] array1 = { 97,23,6,13,34,54,69,99,10,85,72,53};
        System.out.println("current array : ");
        printArray(array);

        System.out.println("\bubble sort steps");
        array=bubbleSort(array);

        System.out.println("\nenhanced sort o");
        bubbleSort(array1);

        System.out.println("\nnormal bubble sort on sorted array : ");
        bubbleSort(array);

        System.out.println("\nenhanced bubble on sorted array:");
        bubbleSortEnhanced(array);
    }
}
