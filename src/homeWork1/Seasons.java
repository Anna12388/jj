package homeWork1;

import java.util.Scanner;

public class Seasons {
    public void test() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название месяца: ");
        String monthName = scanner.nextLine().toLowerCase();
        String season = "";
        switch (monthName) {
            case "декабрь":
            case "январь":
            case "февраль":
                System.out.println("Зима");
                break;

            case "март":
            case "апрель":
            case "май":
                System.out.println("Весна");
                break;
            case "июнь":
            case "июль":
            case "август":
                System.out.println("Лето");
                break;
            case "сентябрь":
            case "октябрь":
            case "ноябрь":
                System.out.println("Осень");
                break;
            default:
                System.out.println("Ошибка: неправильное название месяца");

        }
    }
}
