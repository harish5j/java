import java.util.Scanner;
public class Season {
    public static void main(String[] args) {
        int m = new Scanner(System.in).nextInt();

        switch(m) {
            case 12,1,2 -> System.out.println("Winter");
            case 3,4,5 -> System.out.println("Summer");
            case 6,7,8 -> System.out.println("Monsoon");
            case 9,10,11 -> System.out.println("Autumn");
            default -> System.out.println("Invalid Month");
        }
    }
}
