package homeWork2;

import java.util.Arrays;

public class Fibonacci {
    public int [] fib (int ArrLenght) {
        int [] fibArray = new int [ArrLenght];
        fibArray [1] =1;
        for (int i = 2; i < ArrLenght; i++) {
            fibArray [i] = fibArray [i-1] + fibArray [i-2];
        }
        System.out.println(Arrays.toString(fibArray));
        return fibArray;
    }
}

