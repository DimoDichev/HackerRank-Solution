import java.util.ArrayDeque;
import java.util.Scanner;

public class StackTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            ArrayDeque<Character> stack = new ArrayDeque<>();
            boolean isFail = false;

            for (int index = 0; index < input.length(); index++) {
                char current = input.charAt(index);

                if ((stack.isEmpty() && current == ')') ||
                        (stack.isEmpty() && current == ']') ||
                        (stack.isEmpty() && current == '}')) {
                    isFail = true;
                    break;
                }

                if (current == '(' || current == '[' || current == '{') {
                    stack.push(current);
                } else {
                    char last = stack.pop();
                    if ((last == '(' && current == ')') ||
                            (last == '[' && current == ']') ||
                            (last == '{' && current == '}')) {
                        continue;
                    } else {
                        stack.push(last);
                    }
                }

            }

            if (isFail || !stack.isEmpty()) {
                System.out.println("false");
            } else {
                System.out.println("true");
            }
        }
    }
}
