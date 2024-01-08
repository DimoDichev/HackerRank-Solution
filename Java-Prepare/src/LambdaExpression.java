import java.math.BigInteger;
import java.util.Scanner;

public class LambdaExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < lines; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");

            String code = tokens[0];
            int number = Integer.parseInt(tokens[1]);

            switch (code) {
                case "1":
                    System.out.println(isOdd(number) ? "ODD" : "EVEN");
                    break;
                case "2":
                    System.out.println(isPrime(number)  ? "PRIME" : "COMPOSITE");
                    break;
                case "3":
                    System.out.println(isPalindrome(tokens[1])  ? "PALINDROME" : "NOT PALINDROME");
                    break;
            }
        }
    }

    private static boolean isPalindrome(String word) {
        StringBuilder sb = new StringBuilder(word).reverse();
        return sb.toString().equals(word);
    }

    private static boolean isPrime(int number) {
        BigInteger numAsBig = BigInteger.valueOf(number);
        return numAsBig.isProbablePrime(1);
    }

    private static boolean isOdd(int number) {
        return number % 2 != 0;
    }

}
