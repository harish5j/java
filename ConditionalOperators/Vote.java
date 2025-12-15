import java.util.Scanner;
public class Vote {
    public static void main(String[] args) {
        int age = new Scanner(System.in).nextInt();

        if (age>=18)
            System.out.println("Eligible to Vote");
        else
            System.out.println("Not Eligible");
    }
}
