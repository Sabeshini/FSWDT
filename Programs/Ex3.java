import java.util.*;
import java.io.*;

public class Ex3 {
    public static void main(String[] args) {
        int i, temp = 0, fn = 0, sn = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a new number");
        int n = sc.nextInt();
        System.out.println("0" + "\n1");
        if (n == 0) {
            System.out.println(fn);
        } else {
            for (i = 0; i <= n; i++) {
                temp = fn + sn;

                if (n < temp) {
                    break;
                }
                System.out.println(temp);
                fn = sn;
                sn = temp;
            }
        }
    }
}
