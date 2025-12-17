import java.util.*;
public class ProductOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter the number: ");
        int product = 1;
        while(n>0){
            product = product * (n%10);
            n = n/10;
        }
        System.out.println("The product is: "+product);
    }
}
