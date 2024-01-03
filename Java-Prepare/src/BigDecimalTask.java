import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BigDecimalTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(scanner.nextLine());
        }

        list.sort((String f, String s) -> {
            BigDecimal first = new BigDecimal(f);
            BigDecimal second = new BigDecimal(s);
            return second.compareTo(first);
        });

        for (String str : list) {
            System.out.println(str);
        }
    }

}
