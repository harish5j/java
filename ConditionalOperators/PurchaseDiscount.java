import java.util.Scanner;
public class PurchaseDiscount {
    public static void main(String[] args) {
        double amount = new Scanner(System.in).nextDouble();
        double discount;

        if (amount >= 10000)
            discount = amount * 0.25;
        else if (amount >= 5000)
            discount = amount * 0.15;
        else
            discount = amount * 0.05;

        System.out.println("Final Price: " + (amount - discount));
    }
}
