import java.util.Scanner;
public class DataUsage {
    public static void main(String[] args) {
        int usage = new Scanner(System.in).nextInt();

        if (usage < 40)
            System.out.println("Low Data");
        else if (usage <= 80)
            System.out.println("Half Consumed");
        else
            System.out.println("Data Over");
    }
}
