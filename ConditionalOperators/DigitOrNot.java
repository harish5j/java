import java.util.Scanner;
public class DigitOrNot {
    public static void main(String[] args) {
        char ch = new Scanner(System.in).next().charAt(0);

        if (Character.isDigit(ch))
            System.out.println("Digit");
        else
            System.out.println("Not a Digit");
    }
}
