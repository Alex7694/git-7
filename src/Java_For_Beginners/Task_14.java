package Java_For_Beginners;

import java.util.Scanner;

public class Task_14 {
    public static void main(String[] args) {
        try{
            System.out.print("Введите целое число: ");
            Scanner in = new Scanner(System.in);
            String S = in.nextLine();
            int X = Integer.parseInt(S);
            double Y = (double)X;
            System.out.println("Введенное числов в формате double: " + Y);
            in.close();
        }catch (NumberFormatException exc) {
            System.out.println("Вы ввели не целое число");
        }
    }
}
