import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sq = n * n, sum = 0;

        while (sq > 0) {
            sum += sq % 10;  //81 -> 1 ->8 -->> 8+1 -> 9
            sq /= 10;      // ->8 -> 1
        }
        System.out.println(sum == n ? "Neon Number" : "Not a Neon Number");
    }
}
