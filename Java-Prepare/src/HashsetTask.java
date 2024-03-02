import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashsetTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> set = new HashSet<>();

        int lines = Integer.parseInt(scanner.nextLine());

        for (int line = 0; line < lines; line++) {
            String pair = scanner.nextLine();

            set.add(pair);
            System.out.println(set.size());
        }
    }
}
