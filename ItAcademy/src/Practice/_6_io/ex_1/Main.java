package Practice._6_io.ex_1;

import java.io.*;

/**
 * Задан файл с многострочным тестом. Прочитать и вывести этот файл в консоль построчно.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        File f = new File("E:\\text.txt");
        BufferedReader fin = new BufferedReader(new FileReader(f));
        String line;
        System.out.println(f.getName());
        while ((line = fin.readLine()) != null)
            System.out.println(line);
    }
}
