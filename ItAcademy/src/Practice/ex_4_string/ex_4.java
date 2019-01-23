package Practice.ex_4_string;

import java.util.Scanner;

public class ex_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите фамилию:");
        String secondName = sc.nextLine();
        System.out.println("Введите имя:");
        String firstName = sc.nextLine();
        System.out.println("Введите отчество:");
        String patronymic = sc.nextLine();
        System.out.println(initials(secondName, firstName, patronymic));

    }

    private static String initials(String secondName, String firstName, String patronymic) {
        char sN = secondName.charAt(0);
        String s1 = sN + ".";
        char fN = firstName.charAt(0);
        String s2 = fN + ".";
        char P = patronymic.charAt(0);
        String s3 = P + ".";
        return (s1 + s2 + s3).toUpperCase();

    }
}
