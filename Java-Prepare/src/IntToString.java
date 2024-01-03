import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        try {
            int n = Integer.parseInt(input);
            System.out.println("Good job");
        } catch (Exception ex) {
            System.out.println("Wrong answer");
        }
    }
}
