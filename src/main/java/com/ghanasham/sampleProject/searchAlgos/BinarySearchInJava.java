package com.ghanasham.sampleProject.searchAlgos;

public class BinarySearchInJava {

//    O(n) is time compelxity
    public static int binarySearch(int[] array, int value) {
        int start =0;
        int end= array.length-1;

        while(start <= end){
            int middle = (start + end)/2;
            if(array[middle] == value){
                return middle;
            }
            else if(array[middle]>value){
                end=middle-1;
                printCurrentArray(array,start,end);
            }
            else{
                start=middle+1;
                printCurrentArray(array,start,end);
            }
        }
        return -1;
    }

    public static int binarySearchRecursion(int[] arrary,int value, int start, int end){
        if (start <= end) {
            int middle = (start + end) / 2;
            printCurrentArray(arrary, start, end);

            if (arrary[middle] == value) {
                return middle;
            } else if (arrary[middle] > value) {
                return binarySearchRecursion(arrary, value, start, middle - 1);
            } else {
                return binarySearchRecursion(arrary, value, middle + 1, end);
            }
        }
        return -1;
    }

    public static void printCurrentArray(int[] array, int start, int end){
        for(int i=start;i<=end;i++){
            System.out.print(" "+array[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,16,17,18,19,20,21,22,24,45,56,62,242,2432,52532,2423525,35235223 };

        System.out.println(binarySearch(array, 999));
        System.out.println(array[27]);

        System.out.println(binarySearchRecursion(array,1,0,array.length-1));

    }
}
