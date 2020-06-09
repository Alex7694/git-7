package Java_For_Beginners;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        try {
            int a, b;
            Scanner in = new Scanner(System.in);
            System.out.print("Введите количество строк массива: ");
            a = in.nextInt();
            System.out.print("Введите количество столбцов массива: ");
            b = in.nextInt();
            int[][] arr = new int[a][b];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print("Введите элемент массива [" + i + "][" + j + "]: ");
                    arr[i][j] = in.nextInt();
                }
            }
            in.close();
            System.out.print("Первая строка матрицы, умноженная на 3: ");
            System.out.print("[");
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(" " + arr[i][j] * 3 + " ");
                }
                System.out.print("]");
            }
            in.close();
        }catch (InputMismatchException e) {
            System.out.println("Вы ввели не целое число");
        }

    }
}