import java.util.Scanner;
public class SeniorCitizen {
    public static void main(String[] args) {
        int age = new Scanner(System.in).nextInt();

        if (age >= 60)
            System.out.println("Eligible for Senior Citizen Benefits");
        else
            System.out.println("Not Eligible");
    }
}
