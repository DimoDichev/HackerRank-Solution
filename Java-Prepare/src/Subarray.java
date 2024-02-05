import java.util.Arrays;
import java.util.Scanner;

public class Subarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());

        int[] arr = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];

            if (temp < 0) {
                result++;
            }

            for (int j = i + 1; j < arr.length ; j++) {
                temp+= arr[j];
                if (temp < 0) {
                    result++;
                }
            }
        }

        System.out.println(result);
    }
}
