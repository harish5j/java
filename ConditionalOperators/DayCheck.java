import java.util.Scanner;
public class DayCheck {
    public static void main(String[] args) {
        int d = new Scanner(System.in).nextInt();

        switch(d) {
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");
            default -> System.out.println("Invalid Day");
        }
    }
}
