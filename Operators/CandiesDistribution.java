import java.util.Scanner;
public class CandiesDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int candies = sc.nextInt();
        int people = sc.nextInt();

        System.out.println("Each Person Gets = " + (candies / people));
        System.out.println("Remaining Candies = " + (candies % people));
    }
}
