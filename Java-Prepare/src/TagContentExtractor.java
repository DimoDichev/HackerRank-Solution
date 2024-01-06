import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "<(.+)>([^<]+)</\\1>";
        Pattern pattern = Pattern.compile(regex);

        int lines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < lines; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);

            boolean found = false;

            while (matcher.find()) {
                System.out.println(matcher.group(2));
                found = true;
            }

            if (!found) {
                System.out.println("None");
            }
        }

    }
}
