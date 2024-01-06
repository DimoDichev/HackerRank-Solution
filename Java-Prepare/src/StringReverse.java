import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        StringBuilder reversedWord = new StringBuilder(word).reverse();

        if (word.contentEquals(reversedWord)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
