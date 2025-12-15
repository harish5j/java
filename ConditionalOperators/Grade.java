import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        int m = new Scanner(System.in).nextInt();

        switch(m/10) {
            case 9,10 -> System.out.println("A");
            case 8 -> System.out.println("B");
            case 7 -> System.out.println("C");
            default -> System.out.println("Fail");
        }
    }
}
