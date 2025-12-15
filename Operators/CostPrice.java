import java.util.Scanner;
public class CostPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sellingPrice = sc.nextDouble();
        double loss = sc.nextDouble();

        double costPrice = sellingPrice - loss;
        System.out.println("Cost Price = " + costPrice);
    }
}
