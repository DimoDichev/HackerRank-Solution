import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> phoneBook = new HashMap<>();

        int entries = Integer.parseInt(scanner.nextLine());

        for (int entry = 0; entry < entries; entry++) {
            String name = scanner.nextLine();
            String number = scanner.nextLine();
            phoneBook.putIfAbsent(name, number);
        }

        while (scanner.hasNext()) {
            String name = scanner.nextLine();
            String phone = phoneBook.get(name);
            if (phone == null) {
                System.out.println("Not found");
            } else {
                System.out.println(name + "=" + phone);
            }
        }
    }
}
