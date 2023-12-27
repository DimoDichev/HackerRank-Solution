import java.util.Scanner;

public class OutputFormatting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");

        for(int i = 0; i < 3; i++) {
            String[] line = scanner.nextLine().split("\\s+");
            String s = line[0];
            int n = Integer.parseInt(line[1]);
            System.out.printf("%-15s%03d%n", s, n);
        }

        System.out.println("================================");
    }
}