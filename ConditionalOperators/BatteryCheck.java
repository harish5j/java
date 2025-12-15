import java.util.Scanner;
public class BatteryCheck {
    public static void main(String[] args) {
        int battery = new Scanner(System.in).nextInt();

        if (battery <= 20)
            System.out.println("Low Battery");
        else if (battery <= 50)
            System.out.println("50% Consumed");
        else
            System.out.println("Battery Full");
    }
}
