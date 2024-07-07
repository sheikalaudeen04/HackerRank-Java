import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();

        // Split the string by non-alphabetic characters
        String[] tokens = s.split("[^A-Za-z]+");
        
        // Filter out empty tokens and collect the valid ones
        List<String> validTokens = new ArrayList<>();
        for (String token : tokens) {
            if (!token.isEmpty()) {
                validTokens.add(token);
            }
        }

        // Print the number of valid tokens
        System.out.println(validTokens.size());

        // Print each token on a new line
        for (String token : validTokens) {
            System.out.println(token);
        }
    }
}
