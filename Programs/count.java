
// To count no of digits in an integer
import java.util.Scanner;

public class count {
    public static void main(String args[]) {
        int i, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer");
        int n = sc.nextInt();
        // int i = String.valueOf(n).length();
        // System.out.println(i);
        if (n == 0) {
            count = 0;
        } else {
            while (n != 0) {
                n = n / 10;
                count++;
            }
        }
        System.out.println(count);
    }
}
