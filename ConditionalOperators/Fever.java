import java.util.Scanner;
public class Fever {
    public static void main(String[] args) {
        int temp = new Scanner(System.in).nextInt();

        if (temp>100)
            System.out.println("Fever");
        else
            System.out.println("Normal");
    }
}
