import java.util.Scanner;

public class DigitOccurred {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digit = sc.nextInt();
        boolean found = false;

        while (n > 0) {
            if (n % 10 == digit) {
                found = true;
                break;
            }
            n /= 10;
        }

        System.out.println(found ? "Digit Found" : "Digit Not Found");
    }
}
