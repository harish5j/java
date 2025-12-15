import java.util.Scanner;
public class MangoDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mangoes = sc.nextInt();
        int pricePerMango = sc.nextInt();

        int free = mangoes / 4;
        int payable = mangoes - free;

        System.out.println("Total Amount = " + (payable * pricePerMango));
    }
}
