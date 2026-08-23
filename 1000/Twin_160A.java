import java.util.Arrays;
import java.util.Scanner;

public class Twin_160A {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of coins");
        int n = sc.nextInt();

        System.out.println("Enter coin values");
        int arr[] = new int[n];

        int total_sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total_sum += arr[i];
        }
        Arrays.sort(arr);

        int sum = 0;
        int count = 0;

        for (int i = n-1; i >= 0; i--) {
            sum += arr[i];
            count++;
            if (sum > total_sum - sum) break;
        }
        System.out.println(count);
    }
}
