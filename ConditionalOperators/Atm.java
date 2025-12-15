import java.util.Scanner;
public class Atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice=sc.nextInt();

        switch(choice) {
            case 1 -> System.out.println("Balance Check");
            case 2 -> System.out.println("Withdraw");
            case 3 -> System.out.println("Deposit");
            default -> System.out.println("Invalid Choice");
        }
    }
}
