package homeWork1;

import java.util.Scanner;

import static java.lang.System.*;

public class Seasons {
    public void test() {
        Scanner scanner = new Scanner(in);
        out.println("Введите название месяца: ");
        String monthName = scanner.nextLine().toLowerCase();
        String season = "";
        out.println(switch (monthName) {
            case "декабрь", "январь", "февраль" -> "Зима";
            case "март", "апрель", "май" -> "Весна";
            case "июнь", "июль", "август" -> "Лето";
            case "сентябрь", "октябрь", "ноябрь" -> "Осень";
            default -> "Ошибка: неправильное название месяца";
        });
    }
}

