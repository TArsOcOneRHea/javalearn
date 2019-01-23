package Practice.ex_4_string;

public class ex_2 {
    public static void main(String[] args) {
        String string = ":(jihhuhuhu:)kjlkjljhkl:(hjhuby(";
        System.out.println(string);
        string = string.replaceAll( ":\\(" , ":)");
        System.out.println(string);
    }
}
