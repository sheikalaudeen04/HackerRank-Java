import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        // If lengths are different, they cannot be anagrams
        if (a.length() != b.length()) {
            return false;
        }
        
        // Create arrays to count occurrences of each character
        int[] charCount = new int[26]; // Assuming only lowercase English letters
        
        // Count occurrences of each character in string a
        for (char c : a.toCharArray()) {
            if (Character.isLetter(c)) { // Check if character is a letter
                charCount[c - 'a']++;
            }
        }
        
        // Decrease count for each character in string b
        for (char c : b.toCharArray()) {
            if (Character.isLetter(c)) { // Check if character is a letter
                charCount[c - 'a']--;
            }
        }
        
        // Check if all counts are zero
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        
        // If all counts are zero, they are anagrams
        return true;
    }
  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}