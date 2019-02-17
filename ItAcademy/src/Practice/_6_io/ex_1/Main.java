package Practice._6_io.ex_1;

import java.io.*;

/**
 * Задан файл с многострочным тестом. Прочитать и вывести этот файл в консоль построчно.
 */
public class Main {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        File file = new File("F:\\Разное\\Рассказы.  Дневник SYSадмина.txth");
        BufferedReader fin = null;
        try {
            fin = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException exception) {
            System.err.println("FILE NOT FOUND!!!");
        }
        String line;
        System.out.println(file.getName());
        try {
            while ((line = fin.readLine()) != null)
                System.out.println(line);
        } catch (NullPointerException exception) {
            System.err.println("NULLLLLLLL!!");
        }
    }
}
