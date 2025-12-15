import java.util.Scanner;
public class PassFail {
    public static void main(String[] args) {
        int marks = new Scanner(System.in).nextInt();

        if (marks >= 35)
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }
}
