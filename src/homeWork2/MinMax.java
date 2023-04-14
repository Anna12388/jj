package homeWork2;

import java.util.ArrayList;
import java.util.Arrays;

public class MinMax {
    public static void main(String[] args) {
        int [] array = {9, 8, 45, 8364, 12};
        Arrays.sort(array);
        int sum = array[0] + array [array.length - 1];
        System.out.println(sum);
    }
}

