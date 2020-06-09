package Java_For_Beginners;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {

        System.out.print("Введите строку: ");
        Scanner input = new Scanner(System.in);
        String str = input.next();
        System.out.println("Вывод строки: " + str);
        input.close();
    }
}
