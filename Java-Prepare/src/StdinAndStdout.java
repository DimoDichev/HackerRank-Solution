import java.util.Scanner;

public class StdinAndStdout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String b = scanner.nextLine();
        String c = scanner.nextLine();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
