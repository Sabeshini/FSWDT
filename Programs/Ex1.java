import java.util.*;
import java.io.*;

public class Ex1 {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for (i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}
