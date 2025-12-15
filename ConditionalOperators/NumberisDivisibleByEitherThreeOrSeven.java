import java.util.*;
public class NumberisDivisibleByEitherThreeOrSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        if(A % 3 == 0||A % 7 ==0){
            System.out.print("The Number is Divisible by 3 or 7");
        }
        else{
            System.out.println("The Number is Not Divisible by both 3 and 7");
        }
    }
}
