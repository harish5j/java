import java.util.Scanner;
public class PositiveNegative {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        if (n >= 0)
            System.out.println("Positive");
        else
            System.out.println("Negative");
    }
}
