import java.util.*;
public class ProductOfTwoNumIsPosRNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int Product = A*B;
        if(Product>0){
            System.out.print("The product of two num is positive");
        }
        else if(Product<0){
            System.out.println("The product of two num is negative");
        }
        else{
            System.out.println("The product is zero");
        }
    }
}
