import java.util.Scanner;
public class BatteryStatus {
    public static void main(String[] args) {
        int battery = new Scanner(System.in).nextInt();

        if (battery >= 80)
            System.out.println("Full");
        else if (battery >= 40)
            System.out.println("Moderate");
        else
            System.out.println("Low");
    }
}
