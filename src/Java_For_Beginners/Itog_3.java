package Java_For_Beginners;

import java.util.Scanner;

public class Itog_3 {
    public static void main(String[] args) {
        try {
            System.out.print("Введите текущий курс доллара к рублю: ");
            Scanner scanner = new Scanner(System.in);
            double kurs = scanner.nextDouble();
            System.out.print("Введите количество рублей: ");
            double rubles = scanner.nextDouble();
            double dollars = Math.round((rubles / kurs) * 100);
            System.out.println("Итого долларов: " + dollars/100);
            scanner.close();
        }catch (Exception e) {
            System.out.println("Необходимо ввести число");
        }
    }
}
