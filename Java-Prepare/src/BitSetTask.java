import java.util.BitSet;
import java.util.Scanner;

public class BitSetTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split("\\s+");
        int bitSetSize = Integer.parseInt(line[0]);
        int operationsCount = Integer.parseInt(line[1]);

        BitSet first = new BitSet(bitSetSize);
        BitSet second = new BitSet(bitSetSize);

        for (int operation = 0; operation < operationsCount; operation++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String command = tokens[0];
            int x = Integer.parseInt(tokens[1]);
            int y = Integer.parseInt(tokens[2]);

            switch (command) {
                case "AND":
                    if (x == 1 && y==2) {
                        first.and(second);
                    }
                    if (x == 2 && y == 1) {
                        second.and(first);
                    }
                    break;
                case "OR":
                    if (x == 1 && y==2) {
                        first.or(second);
                    }
                    if (x == 2 && y == 1) {
                        second.or(first);
                    }
                    break;
                case "XOR":
                    if (x == 1 && y==2) {
                        first.xor(second);
                    }
                    if (x == 2 && y == 1) {
                        second.xor(first);
                    }
                    break;
                case "FLIP":
                    if (x == 1) {
                        first.flip(y);
                    }
                    if (x == 2) {
                        second.flip(y);
                    }
                    break;
                case "SET":
                    if (x == 1) {
                        first.set(y);
                    }
                    if (x == 2) {
                        second.set(y);
                    }
                    break;
            }

            System.out.println(first.cardinality() + " " + second.cardinality());
        }
    }
}
