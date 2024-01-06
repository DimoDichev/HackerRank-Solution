import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDuplicateWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "\\b(\\w+)\\b(\\s+\\1)+\\b";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        int sequence = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < sequence; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);

            while (matcher.find()) {
                input = input.replace(matcher.group(), matcher.group(1));
            }

            System.out.println(input);
        }

    }
}
