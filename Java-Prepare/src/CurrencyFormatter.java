import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double payment = Double.parseDouble(scanner.nextLine());

        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String in = NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment);
        String ch = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String fr = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        in = "Rs." + in.substring(in.indexOf('\u20B9') + 1);
        ch = "\uFFE5" + ch.substring(ch.indexOf('\u00A5') + 1);

        System.out.println("US: " + us);
        System.out.println("India: " + in);
        System.out.println("China: " + ch);
        System.out.println("France: " + fr);
    }
}
