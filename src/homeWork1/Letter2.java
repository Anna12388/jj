package homeWork1;

import java.util.Scanner;

public class Letter2 {
    public void testSwitch() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите букву: ");
        String symbol = scanner.nextLine().toLowerCase();
        switch (symbol) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("Гласная буква");
                break;
            default:
                System.out.println("Согласная буква");
                break;
        }
    }
}

