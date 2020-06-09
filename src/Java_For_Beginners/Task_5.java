package Java_For_Beginners;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_5 {

        static void mult_tab ( int f, int g) {
            if (g > 10)
                return;
            System.out.println(f + " * " + g + " = " + f * g);
            mult_tab(f, g + 1);
        }

        public static void main (String[]args) {
            try {
                System.out.print("Введите целое число: ");
                Scanner scanner = new Scanner(System.in);
                int f = scanner.nextInt();
                mult_tab(f, 1);
                scanner.close();
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели не целое число");
            }
        }
    }



