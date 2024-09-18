
// Sum of two arrays
import java.util.Scanner;

public class Ex9 {
    public void Arrsum(int a1[][], int a2[][], int row, int col) {
        int a3[][] = new int[row][col];

        int i, j;
        System.out.println("The array is : ");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                a3[i][j] = a1[i][j] + a2[i][j];
                System.out.print(a3[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int row, col, i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows and column:");
        row = sc.nextInt();
        col = sc.nextInt();

        int a1[][] = new int[row][col];
        int a2[][] = new int[row][col];
        System.out.println("Enter the 1st array:");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.println("Enter the array value a[" + i + "][" + j + "]");
                a1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the 2nd array:");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.println("Enter the array value a[" + i + "][" + j + "]");
                a2[i][j] = sc.nextInt();
            }
        }
        Ex9 a = new Ex9();
        a.Arrsum(a1, a2, row, col);
    }
}
