package Practice._6_io.ex_4;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Задан файл с текстом. В каждой строке найти и вывести наибольшее число цифр, идущих подряд.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        String regex = "\\d+";
        File file = new File("E:\\text.txt");
        List<String> strings = Files.readAllLines(Paths.get(file.toURI()));
        for (String str : strings){
            String s = find(regex, str);
            System.out.println(s);
        }
    }

    static String find(String regex, String strings) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(strings);
        String maxLenghtNumber = "";
        while (matcher.find()) {
            String match = matcher.group();
            if(match.length() > maxLenghtNumber.length()){
                maxLenghtNumber = match;
            }
        }
        return maxLenghtNumber;
    }
}
