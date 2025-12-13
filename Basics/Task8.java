import java.util.*;
public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer number: ");
        int num = sc.nextInt();
        String Oct = Integer.toOctalString(num);
        System.out.print("The octal number is: "+ Oct);
    }
}
