package Practice._6_io;

import java.io.*;

import static java.awt.SystemColor.text;

/**
 * Задан файл с текстом, найти и вывести в консоль все слова, начинающиеся с гласной буквы.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        File f = new File("E:\\text.txt");
        BufferedReader fin = new BufferedReader(new FileReader(f));
        String line = fin.readLine().toLowerCase();
        char firstWord = line.charAt(0);
        System.out.println(firstWord);
//        for (int i = 0; line.length(); i++)
            if (firstWord == 'a' || firstWord == 'e' || firstWord == 'i' || firstWord == 'o' || firstWord == 'u') {
            }
    }
    static void readBytesWhileTrue(InputStream in) throws Exception {
        while (true) {
            int oneByte = in.read();
            if (oneByte != -1) {
                System.out.print(" " + oneByte);
            } else {
                System.out.print("\n" + "end");
                break;
            }
        }
    }

}

