import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int listSize = Integer.parseInt(scanner.nextLine());
        List<Integer> list = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int query = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < query; i++) {
            String command = scanner.nextLine();

            if (command.equals("Insert")) {
                int[] tokens = Arrays
                        .stream(scanner.nextLine().split("\\s+"))
                        .mapToInt(Integer::parseInt)
                        .toArray();
                int index = tokens[0];
                int value = tokens[1];
                list.add(index, value);
            } else if (command.equals("Delete")) {
                int index = Integer.parseInt(scanner.nextLine());
                list.remove(index);
            }
        }

        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }
}
