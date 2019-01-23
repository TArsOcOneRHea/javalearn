package Practice.ex_4_string;

public class ex_2 {
    public static void main(String[] args) {

        String repl = repl(":(");
        System.out.println(repl.equals(":)"));
        System.out.println(repl("").equals(""));
        System.out.println(repl(":)").equals(":)"));
    }

    private static String repl(String string) {
        return string.replaceAll( ":\\(" , ":)");
    }
}
