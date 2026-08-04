import java.util.Scanner;

public class helpfulMaths_339A {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i += 2) {
            for (int j = i +2; j < arr.length; j += 2) {
                if (arr[i] > arr[j]) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(new String(arr));
    }
}
