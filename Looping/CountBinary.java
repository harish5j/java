import java.util.Scanner;

public class CountBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bin = sc.next();
        int zeros = 0, ones = 0;

        for (char ch : bin.toCharArray()) {
            if (ch == '0') zeros++;
            else if (ch == '1') ones++;
        }

        System.out.println("Zeros: " + zeros);
        System.out.println("Ones: " + ones);
    }
}
