import java.util.Scanner;

public class NumIsDivisibleByBothTwoandFiveButnotByEight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        if(A % 2 == 0 && A % 5 == 0 || A != 8){
            System.out.print("Condition Satisfied");
        }
        else{
            System.out.println(" Condition Not Satisfied");
        }
    }
}
