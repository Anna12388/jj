package homeWork1;

import java.util.Scanner;

public class Sum {
    public void test() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввести минимальное целое число:");
        int FirstNumber = scanner.nextInt();
        System.out.println("Ввести максимальное целое число");
        int SecondNumber = scanner.nextInt();
        int sum = 0;
        for (int i = FirstNumber +1; i < SecondNumber; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println("Сумма всех чисел, которые делятся на 3 и расположены между"
                +  FirstNumber  +  "и"  +  SecondNumber  +  " : "  + sum);


    }
}

