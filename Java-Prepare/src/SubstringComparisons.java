import java.util.Scanner;

public class SubstringComparisons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        int length = Integer.parseInt(scanner.nextLine());

        String smallest = "";
        String largest = "";

        for (int i = 0; i <= word.length() - length; i++) {
            String current = word.substring(i, i + length);

            if (smallest.isEmpty() || current.compareTo(smallest) < 0) {
                smallest = current;
            }

            if (largest.isEmpty() || current.compareTo(largest) > 0) {
                largest = current;
            }
        }

        System.out.println(smallest);
        System.out.println(largest);
    }
}
