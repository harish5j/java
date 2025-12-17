import java.util.Scanner;

public class MultiplyWithOutOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = 0;

        for (int i = 1; i <= b; i++) {
            result += a;
        }

        System.out.println("Result = " + result);
    }
}
