import java.util.Scanner;
public class PenDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pens = sc.nextInt();
        int pricePerPen = sc.nextInt();

        int free = (pens / 5) * 2;
        int payable = pens - free;

        System.out.println("Total Amount = " + (payable * pricePerPen));
    }
}
