
// not completedz
import java.util.ArrayList;
import java.util.Scanner;

public class Duplicate {

    public void findDupe(ArrayList<Integer> A1, int len) {
        int i, j;
        // a = A1.get(0);
        // for (i = 0; i < len - 1; i++) {

        // if (A1.get(i) == A1.get(i + 1)) {
        // A1.remove(i);
        // i--;
        // }

        // }

        ArrayList<Integer> finArr = new ArrayList<Integer>();
        // finArr.add(A1.get(0));
        for (i = 0; i < len; i++) {
            boolean isDupe = false;
            for (j = 0; j < finArr.size(); j++) {
                if (A1.get(i).equals(finArr.get(j))) {
                    isDupe = true;
                    // return isDupe;
                    break;
                }
                // if (A1.get(i) != finArr.get(j)) {

                // finArr.add(A1.get(j));
                // System.out.println(finArr);

                // }
            }
            if (!isDupe) {
                finArr.add(A1.get(i));
            }
        }

        System.out.println("The final list is" + finArr);
    }

    public static void main(String[] args) {
        int i;
        ArrayList<Integer> A1 = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array list");
        int len = sc.nextInt();
        System.out.println("Enter the number for the list:");
        for (i = 0; i < len; i++) {
            int a = sc.nextInt();
            A1.add(a);
        }
        Duplicate dd = new Duplicate();
        dd.findDupe(A1, len);
    }
}
