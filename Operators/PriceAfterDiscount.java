import java.util.Scanner;
public class PriceAfterDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price = sc.nextDouble();
        double discountPercent = sc.nextDouble();

        double discount = price * discountPercent / 100;
        double finalPrice = price - discount;

        System.out.println("Price After Discount = " + finalPrice);
    }
}
