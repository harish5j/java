import java.util.Scanner;
public class SellingPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double costPrice = sc.nextDouble();
        double profit = sc.nextDouble();

        double sellingPrice = costPrice + profit;
        System.out.println("Selling Price = " + sellingPrice);
    }
}
