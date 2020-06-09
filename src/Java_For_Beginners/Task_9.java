package Java_For_Beginners;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
       try {
           Scanner in = new Scanner(System.in);
           System.out.print("Введите размер массива: ");
           int size = in.nextInt();
           int array[] = new int[size];
           for (int i = 0; i < size; i++) {
               System.out.print("Введите " + i + " элемент массива: ");
               array[i] = in.nextInt();
           }
           System.out.print("Ваш массив, где каждый элемент массива умножен на 2: ");
           System.out.print("[");
           for(int i = 0; i < size; i++) {
               System.out.print(" " + array[i] * 2 + " ");
           }
           System.out.print("]");
           in.close();
       }catch (InputMismatchException exc) {
           System.out.println("Вы ввели не целое число");
       }
    }
}

