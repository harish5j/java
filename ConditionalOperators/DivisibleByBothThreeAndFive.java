import java.util.*;
public class DivisibleByBothThreeAndFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if((a % 3 == 0 && a % 5 == 0)){
            System.out.print("The Number is Divisible by both 3 and 5");
        }
        else{
            System.out.println("The Number is not divisible by both 3 and 5");
        }
    }
}
