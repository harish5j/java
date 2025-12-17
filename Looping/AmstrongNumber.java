import java.util.*;
public class AmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Amstrong Number: ");
        int n = sc.nextInt();
        int original = n;
        int sum = 0;
        int digits = String.valueOf(n).length();
        while(n>0){
            int digit = n % 10;
            sum+=Math.pow(digit,digits);
            n = n/10;
        }
        if(original==sum){
            System.out.println("It is a Amstrong Number");
        }
        else{
            System.out.println("It is Not a Amstrong Number");
        }
        sc.close();
    }
}
