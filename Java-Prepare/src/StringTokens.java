import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringTokens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        List<String> output = new ArrayList<>();

        int startWord = 0;

        for (int i = 0; i < word.length(); i++) {
            if ((word.charAt(i) < 65 || word.charAt(i) > 122) || (word.charAt(i) > 90 && word.charAt(i) < 97)) {
                String substring = word.substring(startWord, i);
                if (!substring.isEmpty()) {
                    output.add(substring);
                }
                startWord = i + 1;
            }
        }

        if (word.length() != startWord) {
            output.add(word.substring(startWord));
        }

        System.out.println(output.size());
        output.forEach(System.out::println);
    }
}
