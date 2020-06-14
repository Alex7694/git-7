package Java_For_Beginners;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            double input_number1 = in.nextDouble();
            System.out.print("Введите второе число: ");
            double input_number2 = in.nextDouble();
            System.out.print("Введите третье число: ");
            double input_number3 = in.nextDouble();
            double middle = (input_number1 + input_number2 + input_number3)/3;

            System.out.println("Cреднее арифметическое чисел x, y, z равно: " + middle);

            int  cc = (int)(middle/2);
            System.out.println("Деление среднего арифметического на 2 без остатка равно: " + cc);

            if (cc > 3)
                System.out.println("Программа выполнена корректно");
            in.close();
        }catch (InputMismatchException e) {
            System.out.println("Вы ввели не число");
        }
    }
}
