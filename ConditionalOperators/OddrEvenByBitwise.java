import java.util.*;
public class OddrEvenByBitwise{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if((a&1)==0){
            System.out.print("The number is Even: "+a);
        }
        else{
            System.out.println("The number is Odd: "+a);
        }
    }
}