import java.util.Scanner;

public class Datatype {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        for (int line = 0; line < lines; line++) {
            String currentLine = scanner.nextLine();
            long num;

            try {
                num = Long.parseLong(currentLine);
            } catch (Exception e) {
                System.out.println(currentLine + " can't be fitted anywhere.");
                continue;
            }

            System.out.println(currentLine + " can be fitted in:");

            if (num >= -128 && num <= 127) {
                System.out.println("* byte");
                System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");
            } else if (num >= -32768 && num <= 32767){
                System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");
            } else if (num >= -2147483648 && num <= 2147483647) {
                System.out.println("* int");
                System.out.println("* long");
            } else {
                System.out.println("* long");
            }
        }
    }
}
