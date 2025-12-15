import java.util.*;
public class TwoNumbersHaveSameLastDigit {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a % 10 == b % 10){
            System.out.print("The both number has same last digit");
        }
        else{
            System.out.println("The both number dosen't have the same last digit");
        }
    }
}
