import java.util.Scanner;

public class WordCapitailization_281A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        char first = Character.toUpperCase(s.charAt(0));
        String result = first + s.substring(1);

        System.out.println(result);
    }
}