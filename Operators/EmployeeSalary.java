import java.util.Scanner;
public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double basic = sc.nextDouble();
        double hra = sc.nextDouble();
        double da = sc.nextDouble();

        double salary = basic + hra + da;
        System.out.println("Total Salary = " + salary);
    }
}
