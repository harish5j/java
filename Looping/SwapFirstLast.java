import java.util.Scanner;

public class SwapFirstLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int last = n % 10;
        int temp = n, pow = 1;

        while (temp >= 10) {
            temp /= 10;
            pow *= 10;
        }

        int first = temp;
        int middle = (n % pow) / 10;
        int result = last * pow + middle * 10 + first;

        System.out.println("Result = " + result);
    }
}
