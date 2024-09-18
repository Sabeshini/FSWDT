// Program to find armstrong number
import java.util.Scanner;

class Ex7 {

    public static void main(String[] args) {
        int i, j, rem, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int s = sc.nextInt();
        int temp = s;
        for (i = 0; i < String.valueOf(temp).length(); i++) {
            rem = s % 10;
            int a = 1;
            for (j = 0; j < String.valueOf(temp).length(); j++) {

                a *= rem;
            }
            // System.out.println(a);
            count += a;

            s = s / 10;
        }
        // System.out.println(count);
        if (temp == count) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an armstrong");
        }
        // System.out.println(count);
    }
}