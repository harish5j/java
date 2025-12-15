import java.util.Scanner;
public class OddrEvenOfFirstDigitOfThreeDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int FirstDigit = a / 100;
        if((FirstDigit&1)==0){
            System.out.print("The number is Even: "+FirstDigit);
        }
        else{
            System.out.println("The number is Odd: "+FirstDigit);
        }
    }
}