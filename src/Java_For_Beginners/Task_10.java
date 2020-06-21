package Java_For_Beginners;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_10 {
        public static void main(String[] args) {
            try {
                Scanner in = new Scanner(System.in);
                System.out.print("Введите количество строк массива: ");
                int a = in.nextInt();
                System.out.print("Введите количество столбцов массива: ");
                int b = in.nextInt();
                int[][] arr = new int[a][b];
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr[i].length; j++) {
                        System.out.print("Введите элемент массива [" + i + "][" + j + "]: ");
                        arr[i][j] = in.nextInt();
                    }
                }
                in.close();
                System.out.print("Первая строка матрицы, умноженная на 3: ");
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.print(" " + arr[0][j] * 3 + " ");
                }
            }catch (InputMismatchException e) {
                System.out.println("Вы ввели не целое число");
            }
        }
    }