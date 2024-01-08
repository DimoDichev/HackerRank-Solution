import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[6][6];

        for (int line = 0; line < 6; line++) {
            int[] currentLine = Arrays
                    .stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[line] = currentLine;
        }

        int maxSum = getMaxSum(matrix);

        System.out.println(maxSum);
    }

    private static int getMaxSum(int[][] matrix) {
        int maxSum = Integer.MIN_VALUE;

        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                int currentSum = matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2] +
                        matrix[row + 1][col + 1] +
                        matrix[row + 2][col] + matrix[row + 2][col + 1] + matrix[row + 2][col + 2];

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }
}
