import java.util.*;
public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer number: ");
        int num = sc.nextInt();
        String hex = Integer.toHexString(num);
        System.out.print("The hexadecimal number is: "+ hex);
    }
}
