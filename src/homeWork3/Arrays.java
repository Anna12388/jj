package arrays;

import java.util.Arrays;

public class ArraysMethods {
    private int [] sortArray(int[]arr){
        Arrays.sort(arr);
        return arr;
    }
    public void printSortArray(int... arr){
        System.out.println(Arrays.toString(sortArray(arr)));
    }
    private int findMaxValue(int[] arr) {
        sortArray(arr);
        int maxValue = arr[arr.length -1];
        return maxValue;
        (int[ ]arr) {
            System.out.println(findMaxValue(arr));
        }
    }
