import java.util.Scanner;

public class PetyaAndStrings_112A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        str1.toLowerCase();
        str2.toLowerCase();

        int i = 0;
        while (i < str1.length()) {
            if (str1.charAt(i) > str2.charAt(i)) {
                System.out.println(1);
                return;
            } else if (str1.charAt(i) < str2.charAt(i)) {
                System.out.println(-1);
                return;
            }
            i++;
        }
        System.out.println(0);
    }
}
