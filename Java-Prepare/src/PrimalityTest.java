import java.math.BigInteger;
import java.util.Scanner;

public class PrimalityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger num = new BigInteger(scanner.nextLine());

        boolean isPrime = num.isProbablePrime(1);

        if (isPrime) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
