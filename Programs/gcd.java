// not complete
import java.util.Scanner;
import java.math.*;
import java.util.ArrayList;

public class gcd {
    public void greatest(int a, int b) {
        int i, j, k, l, mA, af = 0, mB;
        ArrayList<Integer> arrA = new ArrayList<Integer>();
        ArrayList<Integer> arrB = new ArrayList<Integer>();
        ArrayList<Integer> arrF = new ArrayList<Integer>();
        for (i = 1; i <= a; i++) {
            if (a % i == 0) {
                arrA.add(i);
            }
        }
        for (j = 1; j <= b; j++) {
            if (b % j == 0) {
                arrB.add(j);
            }
        }
        // mA = max(arrA);
        // mB = max(arrB);

        // if (mA == mB) {
        // System.out.println(mA + "is the gcd");
        // } else {
        // System.out.println("no gcd");
        // }

        for (k = 0; k <= Math.max(a, b); k++) {
            for (l = 0; l <= Math.max(a, b) + 1; l++) {
                if (arrA.get(k) == arrB.get(l)) {
                    arrF.add(arrB.get(l));
                }
            }
        }
        // for (i = 0; i <= arrF.size(); i++) {
        // if (arrF.get(i) < arrF.get(i + 1)) {
        // af = arrF.get(i + 1);
        // } else {
        // af = arrF.get(i);
        // }
        // }
        if (!arrF.isEmpty()) {
            af = arrF.get(0);
            for (i = 0; i < arrF.size(); i++) {
                if (arrF.get(i) > af) {
                    af = arrF.get(i);
                }
            }
        }
        System.out.println(af + "is the gcd");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        gcd g = new gcd();
        g.greatest(a, b);
    }

}
