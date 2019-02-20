package Practice._6_io.ex_3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Задан файл с текстом, найти и вывести в консоль все слова,
 * для которых последняя буква одного слова совпадает с первой буквой следующего слова
 */
public class Main {
    public static void main(String[] args) {
        String regex = "\\w+(\\w)(?=\\s+\\1)";
        String line = "Of friendship on inhabiting diminution discovered as. Did friendly eat breeding building few nor.";
        find(line, regex);
    }

    static void find(String regex, String input) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            String match = matcher.group();
            System.out.println(match);
        }
    }
}

