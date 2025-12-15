import java.util.*;
public class OddrEven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2==0){
            System.out.print("It is a Even number: "+a);
        }
        else{
            System.out.print("It is a Odd number: "+a);
        }
    }
}