import java.util.*;
public class PositiveRnegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        if(A>0){
            System.out.print("The Number is Positive");
        }
        else if(A<0){
            System.out.println("The Number is Negative");
        }
        else{
            System.out.println("The Number is Zero");
        }
    }
}
