import java.util.Scanner;
public class LastDigit {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println("Last Digit = " + (n % 10));
    }
}
