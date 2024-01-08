import java.util.Scanner;

public class OneDArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[lines];

        for (int index = 0; index < lines; index++) {
            arr[index] = Integer.parseInt(scanner.nextLine());
        }

        for (int number : arr) {
            System.out.println(number);
        }
    }
}
