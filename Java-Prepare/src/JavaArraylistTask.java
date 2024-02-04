import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JavaArraylistTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<List<Integer>> memory = new ArrayList<>();

        int listCount = Integer.parseInt(scanner.nextLine());

        for (int count = 0; count < listCount; count++) {
            List<Integer> current = Arrays.stream(scanner.nextLine()
                    .split("\\s+"))
                    .skip(1)
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            memory.add(current);
        }

        int numOfSearch = Integer.parseInt(scanner.nextLine());

        for (int search = 0; search < numOfSearch; search++) {
            int[] searchValue = Arrays.stream(scanner.nextLine()
                            .split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int arrNum = searchValue[0];
            int valueNum = searchValue[1];

            if (arrNum > memory.size()) {
                System.out.println("ERROR!");
            } else if (memory.get(arrNum - 1).size() < valueNum) {
                System.out.println("ERROR!");
            } else {
                System.out.println(memory.get(arrNum - 1).get(valueNum - 1));
            }
        }
    }
}
