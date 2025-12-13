import java.util.*;
public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the octal number: ");
        String oct = sc.nextLine();
        int Octal = Integer.parseInt(oct,8);
        System.out.print("The integer value is: "+Octal);
    }
}
