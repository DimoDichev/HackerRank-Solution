import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String ipAddress = scanner.next();
            System.out.println(checkIpAddress(ipAddress));
        }
    }

    private static boolean checkIpAddress(String ipAddress) {
        String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
        String regex = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;

        Pattern pattern = Pattern.compile(regex);

        if (ipAddress == null || ipAddress.isEmpty()) {
            return false;
        }

        Matcher matcher = pattern.matcher(ipAddress);

        return matcher.matches();
    }
}
