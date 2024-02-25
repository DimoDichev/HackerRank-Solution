import java.util.Arrays;
import java.util.Scanner;

public class OneDArrayPartTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int calls = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < calls; i++) {
            int leap = Arrays
                    .stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray()[1];
            int[] game = Arrays
                    .stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            if (canWin(leap, game, 0)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }

    private static boolean canWin(int leap, int[] game, int start) {
        if (start < 0 || start >= game.length || game[start] == 1) {
            return false;
        }
        if (start == game.length - 1 || start + leap >= game.length) {
            return true;
        }

        game[start] = 1;

        return canWin(leap, game, start + leap) ||
                canWin(leap, game, start + 1) ||
                canWin(leap, game, start - 1);
    }
}
