import java.time.LocalDate;
import java.util.Scanner;

public class DayOfYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String date = sc.nextLine();

        LocalDate d = LocalDate.parse(date);

        System.out.println(d.getDayOfYear());

        sc.close();
    }
}