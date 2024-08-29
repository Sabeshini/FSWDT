import java.io.*;
import java.util.*;

public class Ex5 {
    public static void main(String[] args) {
        int i;
        String a = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word:");
        String s = sc.nextLine();
        int n = s.length();
        for (i = n - 1; i >= 0; i--) {
            a = a.concat(String.valueOf(s.charAt(i)));

        }

        if (s.equals(a)) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("Not an palindrome.");
        }
    }

}
