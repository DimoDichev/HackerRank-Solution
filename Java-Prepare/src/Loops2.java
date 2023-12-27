import java.util.Scanner;

public class Loops2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        for (int line = 0; line < lines; line++) {
            String[] numbers = scanner.nextLine().split("\\s+");
            int a = Integer.parseInt(numbers[0]);
            int b = Integer.parseInt(numbers[1]);
            int n = Integer.parseInt(numbers[2]);

            for (int i = 0; i < n; i++) {
                a += (int) Math.pow(2, i) * b;
                System.out.print(a + " ");
            }

            System.out.println();
        }
    }
}
