package Java_For_Beginners;
import java.io.*;

public class Task_16 {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("src\\Java_For_Beginners\\file1.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            String text = null;
            do {
                text = reader.readLine();
                System.out.println(text);
            } while (text != null);
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файла не найдено");        }
        catch (IOException e) {
            System.out.println("Во время работы с файлом возникла ошибка");
            e.printStackTrace();
        }
    }
}


