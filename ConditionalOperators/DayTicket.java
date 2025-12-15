import java.util.Scanner;
public class DayTicket {
    public static void main(String[] args) {
        String day = new Scanner(System.in).next();

        if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday"))
            System.out.println("Weekend Price: ₹150");
        else
            System.out.println("Weekday Price: ₹100");
    }
}
