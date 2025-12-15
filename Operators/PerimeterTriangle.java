import java.util.Scanner;
public class PerimeterTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double perimeter = a + b + c;
        System.out.println("Perimeter = " + perimeter);
    }
}
