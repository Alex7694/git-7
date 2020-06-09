package Java_For_Beginners;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task_4 {
    public static void main(String args[]) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число в двоичном формате: ");
        String str = scanner.nextLine();
        int sum = 0, h, k;
        for (int i = 0; i < str.length(); i++) {
            k = str.charAt(str.length() - 1 - i);
            if(k == '1' || k == '0') {
                if (k == '1')
                    h = 1;
                else h = 0;
            } else {
                System.out.println("Необходимо ввести число в двоичном формате");
                break;
            }
            sum += (h * Math.pow(2, i));
        }
        System.out.println("Число " + str + " в двоичном формате  =" + " числу " + sum  + " в десятичном формате"  );
    }
}