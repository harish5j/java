import java.util.Scanner;
public class ATMPin {
    public static void main(String[] args) {
        int storedPin = 1234;
        int pin = new Scanner(System.in).nextInt();

        if (pin == storedPin)
            System.out.println("PIN Matched. Withdrawal Allowed");
        else
            System.out.println("Incorrect PIN");
    }
}
