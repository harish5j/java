import java.util.*;
public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ASCII value: ");
        int ascii = sc.nextInt();
        char ch = (char) ascii;
        System.out.println("The ASCII value is " + ascii +"the character is " + ch);
    }
}