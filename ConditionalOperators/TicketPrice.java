import java.util.Scanner;
public class TicketPrice {
    public static void main(String[] args) {
        int age = new Scanner(System.in).nextInt();

        if (age < 12)
            System.out.println("Ticket Price: ₹50");
        else if (age < 60)
            System.out.println("Ticket Price: ₹100");
        else
            System.out.println("Ticket Price: ₹70");
    }
}
