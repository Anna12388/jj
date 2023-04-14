package homeWork2;

public class Difference {
    public void diff() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                evenSum += arr[i];
            } else {
                oddSum += arr[i];
            }
        }
        int difference = evenSum - oddSum;
        System.out.println("Разница между суммой четных и нечетных элементов равна:" + difference);
    }
}

