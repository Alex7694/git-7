package Java_For_Beginners;
import java.io.*;
import java.util.Scanner;

public class Task_18 {
        public static void main(String[] args) {
            try {
                FileReader readerline = new FileReader("E:\\ rtx.txt");
                BufferedReader bufferedReaderline = new BufferedReader(readerline);
                String line;
                System.out.println("Содержание файла:");
                while ((line = bufferedReaderline.readLine()) != null) {
                    System.out.println(line);
                }
                readerline.close();
                Scanner scanner = new Scanner(System.in);
                System.out.println();
                System.out.print("Введите  строку 1: ");
                String s = scanner.nextLine();
                System.out.print("Введите  строку 2: ");
                String f = scanner.nextLine();
                FileWriter w = new FileWriter("E:\\ rtx.txt", false);
                BufferedWriter bufferedWriter = new BufferedWriter(w);
                bufferedWriter.write(s);
                bufferedWriter.newLine();
                bufferedWriter.write(f);
                bufferedWriter.close();
            } catch (FileNotFoundException exc) {
                System.out.println("Файл не найден");
            } catch (IOException e) {
                System.out.println("Ошибка при работе с файлом");
            }
        }
    }