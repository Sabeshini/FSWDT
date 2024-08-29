import java.util.*;
import java.io.*;

public class Ex2 {
    public static void main(String[] args) {
        int fn = 0, sn = 1, i, temp = 0;
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The fibonacci series are : \n0 \n 1");

        while (temp < n) {

            for (i = 0; i <= n; i++) {
                temp = fn + sn;
                if (temp > n) {
                    break;
                }
                System.out.println(temp);

                fn = sn;
                sn = temp;

            }

        }
    }
}

/*
 * fn =1 sn =2
 * fn = 2 sn = 3
 * 
 * 
 */