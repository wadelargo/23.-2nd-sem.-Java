import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

public class Calendar_exampleextends {
    public static void main(String[] args) {
        // Create a calendar instance
        Calendar calendar = new GregorianCalendar();

        // Set the desired year and month
        int year = 2023;
        int month = 5; // January is 0, February is 1, and so on

        // Set the calendar's year and month
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);

        // Get the number of days in the month
        int numberOfDays = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        // Print the month and year
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM yyyy");
        String monthYear = sdf.format(calendar.getTime());
        System.out.println(monthYear);

        // Print the days of the month
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        for (int i = 1; i < dayOfWeek; i++) {
            System.out.print("    ");
        }
        for (int day = 1; day <= numberOfDays; day++) {
            System.out.printf("%3d ", day);
            if (dayOfWeek % 7 == 0) {
                System.out.println();
            }
            dayOfWeek++;
        }
        System.out.println();
    }
}