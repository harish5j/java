import java.util.*;
public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the hexadecimal number: ");
        String hex = sc.nextLine();
        int decimal = Integer.parseInt(hex,16);
        System.out.print("The integer value is: "+decimal);
    }
}
