package com.ghanasham.sampleProject.searchAlgos;

public class LinearSearchInJava {

//    O(n) is time compelxity
    public static int linearSearch(int[] array, int value) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        System.out.println(linearSearch(array, 121));


    }
}
