import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class JavaDateTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String date = sc.nextLine();

        LocalDate d = LocalDate.parse(
            date,
            DateTimeFormatter.ofPattern("dd-MM-yyyy")
        );

        System.out.println("Date: " + d);
        System.out.println("Day: " + d.getDayOfMonth());
        System.out.println("Month: " + d.getMonthValue());
        System.out.println("Year: " + d.getYear());
        System.out.println("Day of Week: " + d.getDayOfWeek());
    }
}