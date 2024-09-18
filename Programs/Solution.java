import java.util.Scanner;

class Solution {
    public void reverseString(char[] s) {
        int i;
        for (i = s.length - 1; i <= 0; --i) {
            System.out.println(String.valueOf(s).charAt(i));
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] srr = s.toCharArray();
        Solution rr = new Solution();
        rr.reverseString(srr);
    }
}