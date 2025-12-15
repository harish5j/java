import java.util.*;
public class Threed{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        if((A<99)||(A>=999)){
            System.out.print("It is not a Three digit number");
        }
        else{
            System.err.println("It is a Three digit number");
        }
    }
}