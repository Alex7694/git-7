package Java_For_Beginners;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        try {
            System.out.print("Введи целое число и узнай имеется ли данное число в константах: ");
            Scanner in = new Scanner(System.in);
            int number = in.nextInt();
            final int X = 10;
            final int Y = 20;
            final int Z = 30;
            if (number == X || number == Y || number == Z)
                System.out.println("Данное значение имеется в константах");
            else System.out.println("Такой константы нет!");
            in.close();
        }
        catch (InputMismatchException exc) {
            System.out.println("Вы ввели не целое число");
        }
    }
}



