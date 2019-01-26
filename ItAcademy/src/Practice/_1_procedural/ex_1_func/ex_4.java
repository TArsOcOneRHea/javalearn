package Practice._1_procedural.ex_1_func;

import java.util.Scanner;
/*
4. Запросить у пользователя 2 слова. Если они одинаковы - вывести "Отлично! Слова одинаковы".
Если они отличаются лишь регистром - "Хорошо. Почти одинаковы"
Если они отличаются, но одной длины - "Ну, хотя бы они одной длины"
Использовать методы класса String: equals(String string), equalsIgnoreCase(String string), length()
 */
public class ex_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 2-а слова для сравнения: ");
        String first_word  = sc.nextLine();
        String second_word = sc.nextLine();

        if (first_word.equals(second_word)){
            System.out.println("Отлично! Слова одинаковы.");
        }
        else if (first_word.equalsIgnoreCase(second_word)){
            System.out.println("Хорошо. Почти одинаковы");
        }
        else if (first_word.length() == second_word.length()){
            System.out.println("Ну, хотя бы они одной длины");
        }
        else {
            System.out.println("Слова не совпадают");
        }
    }
}
