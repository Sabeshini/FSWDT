
// Printing of an 2D matrix
import java.util.*;

// import java.io.*;
class Ex6 {
    public static void main(String[] args) {
        int i, j;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int num = 1;
        // rows
        for (i = 0; i < n; i++) {
            // columns
            for (j = 0; j < n; j++) {
                // System.out.print(num + " ");
                System.out.println(j);
                num++;
            }
            System.out.println();
        }

    }
}

// input:9
// output:
// 123
// 456
// 789

// input:4
// 1234
// 5678
// 9 101112
// // 13141516

// import java.util.Scanner;

// class Ex6 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the number:");
// int n = sc.nextInt();

// int num = 1; // Initialize the starting number

// for (int i = 0; i < n; i++) { // Loop through rows
// for (int j = 0; j < n; j++) { // Loop through columns
// System.out.print(num + " "); // Print the number followed by a space
// num++; // Increment the number
// }
// System.out.println(); // Move to the next line after each row
// }

// sc.close(); // Close the scanner
// }
// }
