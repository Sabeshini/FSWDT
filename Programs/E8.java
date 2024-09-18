// factorial of a number
import java.util.Scanner;

class E8 {
    public static void fact(int f) {
        int i, facto = 1;

        for (i = f; i >= 1; --i) {
            facto *= i;
        }
        System.out.println("The factorial of " + f + "is " + facto);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int f = sc.nextInt();
        E8 e = new E8();
        e.fact(f);
    }
}