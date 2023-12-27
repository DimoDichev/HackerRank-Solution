import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 1;

        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            System.out.println(counter++ + " " + line);
        }
    }
}
