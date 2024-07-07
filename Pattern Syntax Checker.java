import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine(); // Consume newline after reading integer

        for (int i = 0; i < T; i++) {
            String pattern = scanner.nextLine();
            if (isValidRegex(pattern)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
        scanner.close();
    }

    public static boolean isValidRegex(String pattern) {
        try {
            Pattern.compile(pattern);
            return true;
        } catch (PatternSyntaxException e) {
            return false;
        }
    }
}