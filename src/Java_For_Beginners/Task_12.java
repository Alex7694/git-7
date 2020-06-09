package Java_For_Beginners;

import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {
        System.out.print("Введите строку: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String str2 = str.replaceAll("\\s+", "");
        System.out.println("Ваша строка, только без пробелов: " + str2);
        input.close();
    }
}
