import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfLines = Integer.parseInt(scanner.nextLine());

        Pattern pattern = Pattern.compile("<(.+?)>([^<]+)</\\1>");

        for (int i = 0; i < numberOfLines; i++) {
            String line = scanner.nextLine();
            boolean found = false;
            Matcher matcher = pattern.matcher(line);

            while (matcher.find()) {
                System.out.println(matcher.group(2));
                found = true;
            }

            if (!found) {
                System.out.println("None");
            }
        }

        scanner.close();
    }
}
