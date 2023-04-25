package homeWork1;

import java.util.Scanner;
public class Exit {
    public void ConsolInput() {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Ввести слово");
                String inputWord = scanner.nextLine().toLowerCase();
                if (inputWord.equals("exit")) {
                    System.out.println("Программа завершена");
                    break;
                } else {
                    System.out.println("Ввели:" + inputWord);
                }
            }
            scanner.close();
        }
    }
}

