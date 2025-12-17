import java.util.*;
public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int n = sc.nextInt();
        int original = n;
        int reversed = 0;
        while(n>0){
            reversed = reversed*10+(n%10);
            n= n/10;
        }
        if(original==reversed){
            System.out.println("The Number is Palindrome");
        }
        else{
            System.out.println("The Number is Not a Palindrome");
        }
        sc.close();
    }
}
