import java.util.Scanner;

public class StringIntroduction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String second = scanner.nextLine();

        System.out.println(first.length() + second.length());

        if (first.compareTo(second) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.printf("%s %s",
                first.substring(0, 1).toUpperCase() + first.substring(1),
                second.substring(0, 1).toUpperCase() + second.substring(1));
    }
}
