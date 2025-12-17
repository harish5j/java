import java.util.Scanner;

public class PowerOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n > 0) {
            while (n % 3 == 0) n /= 3;
        }

        System.out.println(n == 1 ? "Power of 3" : "Not a Power of 3");
    }
}
