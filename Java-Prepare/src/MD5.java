import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class MD5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] byteResult = md5.digest(input.getBytes());
            StringBuilder result = new StringBuilder();

            for (byte b : byteResult) {
                result.append(String.format("%02x", b));
            }

            System.out.println(result);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
