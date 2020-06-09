package Java_For_Beginners;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_15 {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите размер массива: ");
            int size = in.nextInt();
            int array[] = new int[size];
            for (int i = 0; i < size; i++) {
                System.out.print("Введите [" + i + "] элемент массива: ");
                array[i] = in.nextInt();
            }

            for (int i = array.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {

                    if (array[j] > array[j + 1]) {
                        int tmp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = tmp;
                    }
                }
            }
            System.out.println(Arrays.toString(array));
            in.close();
        }catch (InputMismatchException exception) {
            System.out.println("Необходимо ввести целое число");
        }
    }
}
