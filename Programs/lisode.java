import java.io.BufferedReader;
import java.io.IOException;
// import java.io.BufferedInputStream;
// import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.lang.*;

public class lisode {
    public static void addi(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        int k;
        LinkedList<Integer> l3 = new LinkedList<Integer>();
        for (k = 0; k < 5; k++) {
            // l3.add(l1.get(k) + l1.get(k));
            l3.add(l1.get(k) + l2.get(k));
        }
        System.out.println(l3);
    }

    public static void main(String[] args) throws IOException {
        int i, j;
        System.out.println("Enter a number:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int a = Integer.parseInt(br.readLine());
        LinkedList<Integer> l1 = new LinkedList<Integer>();
        for (i = 0; i < 5; i++) {
            System.out.println("enter l1 val");
            int val = Integer.parseInt(br.readLine());
            l1.add(val);
        }
        LinkedList<Integer> l2 = new LinkedList<Integer>();
        for (j = 0; j < 5; j++) {
            System.out.println("enter l2 val");
            int val = Integer.parseInt(br.readLine());
            l2.add(val);
        }

        addi(l1, l2);
    }
}
