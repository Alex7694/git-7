package Java_For_Beginners;
import java.util.Scanner;

public class Itog_1 {
    public static void main(String args[])  {
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
            sum += (h * (1 << i));
        }
        System.out.println("Число " + str + " в двоичном формате = " + "числу " + sum  + " в десятичном формате");
        scanner.close();
   }
}
