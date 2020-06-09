package Java_For_Beginners;

import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {
        int result;
        Scanner input = new Scanner(System.in);
        System.out.print("Введите строку 1: ");
        String str1 = input.nextLine();
        System.out.print("Введите строку 2: ");
        String str2 = input.nextLine();
        int m = str1.length();
        int c = str2.length();
        if(m == c)
            System.out.println("Длины строки 1 и 2 равны");
        else if(m > c)
            System.out.println("Cтрока с наибольшей длинной: " + str1);
        else
            System.out.println("Cтрока с наибольшей длинной: " + str2);
        input.close();
    }
}
