import java.util.*;

public class Ex4 {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.next();
        int n = s.length();
        System.out.println("The reversed string is:");
        for (i = n - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }
}
