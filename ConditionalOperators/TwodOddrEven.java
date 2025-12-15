import java.util.*;
public class TwodOddrEven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a-b;
        if(c%2==0){
            System.out.print("It is a Even number: "+c);
        }
        else{
            System.out.print("It is a Odd number: "+c);
        }
    }
}