import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sq = n * n;

        if (String.valueOf(sq).endsWith(String.valueOf(n)))
            System.out.println("Automorphic Number");
        else
            System.out.println("Not an Automorphic Number");
    }
}
