import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DequeueTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int subarraySize = scanner.nextInt();

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        Set<Integer> set = new HashSet<>();
        int max = 0;

        for (int i = 0; i < size; i++) {
            int num = scanner.nextInt();

            deque.offer(num);
            set.add(num);

            if (deque.size() == subarraySize) {
                max = Math.max(max, set.size());

                int removed = deque.poll();

                if (!deque.contains(removed)) {
                    set.remove(removed);
                }
            }
        }

        System.out.println(max);
    }
}
