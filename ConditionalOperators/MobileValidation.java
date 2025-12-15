import java.util.Scanner;
public class MobileValidation {
    public static void main(String[] args) {
        String mobile = new Scanner(System.in).next();

        if (mobile.length() == 10)
            System.out.println("Valid Number");
        else
            System.out.println("Invalid Number");
    }
}
