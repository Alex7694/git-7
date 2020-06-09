package Java_For_Beginners;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите первое целое число: ");
            int input_number1 = in.nextInt();
            System.out.print("Введите второе целое число: ");
            int input_number2 = in.nextInt();
            System.out.print("Введите третье целое число: ");
            int input_number3 = in.nextInt();
            int middle = (input_number1 + input_number2 + input_number3)/3;

            System.out.println("Cреднее арифметическое чисел x, y, z равно: " + middle);

            int cc = middle/2;
            System.out.println("Деление среднего арифметического на 2 без остатка равно: " + cc);

            if (cc > 3)
                System.out.println("Программа выполнена корректно");
            in.close();
        }catch (InputMismatchException e) {
            System.out.println("Вы ввели не целое число");
        }
    }
}
