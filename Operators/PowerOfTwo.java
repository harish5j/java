import java.util.Scanner;
public class PowerOfTwo {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println(n > 0 && (n & (n - 1)) == 0);
    }
}
