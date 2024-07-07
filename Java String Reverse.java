import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the input string
        String s = scanner.nextLine();
        scanner.close();
        
        // Check if the string is a palindrome
        if (isPalindrome(s)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    
    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}