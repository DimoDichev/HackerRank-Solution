import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUsernameRegex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{7,29}";

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String username = scanner.nextLine();

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(username);

            if (matcher.matches()) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
