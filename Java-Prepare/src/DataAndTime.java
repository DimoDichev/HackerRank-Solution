import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class DataAndTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split("\\s+");

        int month = Integer.parseInt(tokens[0]);
        int day = Integer.parseInt(tokens[1]);
        int year = Integer.parseInt(tokens[2]);

        LocalDate date = LocalDate.of(year, month, day);

        DayOfWeek dayOfWeek = date.getDayOfWeek();

        System.out.println(dayOfWeek);
    }
}
