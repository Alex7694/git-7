package Java_For_Beginners;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Itog_2 {
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
                int temp, j;
                for(int i = 0; i < array.length - 1; i++){
                    if (array[i] > array[i + 1]) {
                        temp = array[i + 1];
                        array[i + 1] = array[i];
                        j = i;
                        while (j > 0 && temp < array[j - 1]) {
                            array[j] = array[j - 1];
                            j--;
                        }
                        array[j] = temp;
                    }
                }
                System.out.println(Arrays.toString(array));
                in.close();
            }catch (InputMismatchException exception) {
                System.out.println("Необходимо ввести целое число");
            }
        }
    }


