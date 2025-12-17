import java.util.Scanner;

public class ArmstrongTillN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int sum = 0, temp = i;
            while (temp > 0) {
                int d = temp % 10;
                sum += d * d * d;
                temp /= 10;
            }
            if (sum == i)
                System.out.print(i + " ");
        }
    }
}
