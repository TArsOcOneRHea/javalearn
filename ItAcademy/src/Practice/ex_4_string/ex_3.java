package Practice.ex_4_string;

import java.util.Scanner;

public class ex_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String string = sc.nextLine();
        System.out.println("Введите слово: ");
        String word = sc.nextLine();
        System.out.println(proverka(string, word));

    }
    private static boolean proverka(String string, String word){
        boolean temp = string.startsWith(word);
        return temp;
    }
}
