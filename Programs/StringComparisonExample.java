public class StringComparisonExample {
    public static void main(String[] args) {
        String s1 = "hello";
        String s3 = new String("hello");
        String s2 = "hello";

        // Comparing using ==
        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false

        // Comparing using equals()
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
    }
}
