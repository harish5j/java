import java.util.Scanner;
class YearDigits {
    public static void main(String[] args) {
        int y = new Scanner(System.in).nextInt();

        if (y/100 == y%100)
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }
}
