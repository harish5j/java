import java.util.Scanner;
public class MiddleDigit {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println("Middle Digit = " + (n / 10) % 10);
    }
}
