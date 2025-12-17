import java.util.*;
public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sqrt = (int) Math.sqrt(n);
        if(sqrt * sqrt == n){
            System.err.println("The Perfect Square: "+sqrt);
        }
        else{
            System.err.println("It is not a Perfect Square");
        }
    }
}
