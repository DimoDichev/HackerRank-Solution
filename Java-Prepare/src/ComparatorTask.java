import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ComparatorTask {
    static class Player{
        String name;
        int score;

        public Player(String name, int score) {
            this.name = name;
            this.score = score;
        }
    }
    static class Checker implements Comparator<Player> {

        @Override
        public int compare(Player first, Player second) {
            if (first.score == second.score) {
                return first.name.compareTo(second.name);
            }

            return second.score - first.score;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        Player[] players = new Player[lines];
        Checker checker = new Checker();

        for (int line = 0; line < lines; line++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            int score = Integer.parseInt(tokens[1]);

            players[line] = new Player(name, score);
        }

        Arrays.sort(players, checker);

        for (Player player : players) {
            System.out.printf("%s %d%n", player.name, player.score);
        }
    }
}
