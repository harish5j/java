import java.util.Scanner;
public class Speed {
    public static void main(String[] args) {
        int speed = new Scanner(System.in).nextInt();

        if (speed>100)
            System.out.println("Over-speeding! Fine imposed.");
        else
            System.out.println("Speed is within limit");
    }
}
