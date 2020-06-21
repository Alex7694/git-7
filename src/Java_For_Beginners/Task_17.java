package Java_For_Beginners;
import java.io.*;

public class Task_17 {
    public static void main(String[] args) {
        String str = null;
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Признак конца - стоп");
        try (FileWriter fw = new FileWriter("src\\Java_For_Beginners\\file2.txt", true)) {
            do {
                System.out.println("Введи текст для добавления в файл. Нажми stop для остановки: ");
                str = br.readLine();
                if(str.compareTo("stop") == 0) break;
                str = str + "\n";
                fw.write(str);
            } while (str.compareTo("stop") != 0);
        }catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }catch (IOException e) {
            System.out.println("Ошибка при работе с файлом");
        }
    }
}
