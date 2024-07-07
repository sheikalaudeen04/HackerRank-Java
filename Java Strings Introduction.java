import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input strings
        String A = scanner.next();
        String B = scanner.next();

        // Sum of the lengths of A and B
        int totalLength = A.length() + B.length();
        System.out.println(totalLength);

        // Lexicographical comparison
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // Capitalizing the first letter of both strings
        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);

        // Printing the capitalized strings
        System.out.println(capitalizedA + " " + capitalizedB);

        scanner.close();
    }
}
