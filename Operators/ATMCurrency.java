import java.util.Scanner;
public class ATMCurrency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        System.out.println("2000 Notes = " + amount / 2000);
        amount %= 2000;

        System.out.println("500 Notes = " + amount / 500);
        amount %= 500;

        System.out.println("100 Notes = " + amount / 100);
    }
}
