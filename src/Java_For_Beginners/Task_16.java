package Java_For_Beginners;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task_16 {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("E:\\ rtx.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            String text = reader.readLine();
            while (text != null) {
                System.out.println(text);
                text = reader.readLine();
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файла не найдено");        }
        catch (IOException e) {
            System.out.println("Во время работы с файлом возникла ошибка");
            e.printStackTrace();
        }
    }
}



