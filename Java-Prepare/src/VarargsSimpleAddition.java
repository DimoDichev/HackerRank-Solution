import java.util.Scanner;

public class VarargsSimpleAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[6];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
        }

        Add add = new Add();
        add.printSum(arr[0], arr[1]);
        add.printSum(arr[0], arr[1], arr[2]);
        add.printSum(arr[0], arr[1], arr[2], arr[3], arr[4]);
        add.printSum(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]);

    }

    static class Add {
        public void printSum(int ... numbers) {
            StringBuilder output = new StringBuilder();
            int sum = 0;

            for (int number : numbers) {
                output.append(number).append("+");
                sum += number;
            }

            output.deleteCharAt(output.length() - 1);
            output.append("=").append(sum);

            System.out.println(output.toString());
        }
    }
}
