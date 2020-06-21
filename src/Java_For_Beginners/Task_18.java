package Java_For_Beginners;
import java.io.*;
import java.util.Scanner;

public class Task_18 {
        public static void main(String[] args) {
            try {
                FileReader readerline = new FileReader("src\\Java_For_Beginners\\file3.txt");
                BufferedReader bufferedReaderline = new BufferedReader(readerline);
                String line = null;
                int line_amout = 0;
                System.out.println("Содержание файла:");
                while ((line = bufferedReaderline.readLine()) != null) {
                    System.out.println(line);
                    line_amout++;
                }
                readerline.close();
                FileWriter w = new FileWriter("src\\Java_For_Beginners\\file3.txt", false);
                BufferedWriter bufferedWriter = new BufferedWriter(w);
                for(int i = 0; i < line_amout; i++) {
                    System.out.print("Введи строку " + (i+1) + ": " );
                    Scanner scanner = new Scanner(System.in);
                    String s = scanner.nextLine();
                    bufferedWriter.write(s);
                    bufferedWriter.newLine();
                }
                bufferedWriter.close();
            } catch (FileNotFoundException exc) {
                System.out.println("Файл не найден");
            } catch (IOException e) {
                System.out.println("Ошибка при работе с файлом");
            }
        }
    }