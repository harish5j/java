import java.util.Scanner;
public class Weather {
    public static void main(String[] args) {
        int temp = new Scanner(System.in).nextInt();

        if (temp < 15)
            System.out.println("Cold");
        else if (temp < 25)
            System.out.println("Pleasant");
        else if (temp < 35)
            System.out.println("Hot");
        else
            System.out.println("Heatwave");
    }
}
