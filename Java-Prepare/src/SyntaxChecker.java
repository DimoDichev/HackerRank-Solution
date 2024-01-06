import java.util.Scanner;
import java.util.regex.Pattern;

public class SyntaxChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String pattern = scanner.nextLine();

            try {
                Pattern p = Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (Exception ex) {
                System.out.println("Invalid");
            }
        }
    }
}
