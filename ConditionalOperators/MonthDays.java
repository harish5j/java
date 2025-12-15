import java.util.Scanner;
class MonthDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year=sc.nextInt(), month=sc.nextInt();

        switch(month) {
            case 1,3,5,7,8,10,12 -> System.out.println("31 Days");
            case 4,6,9,11 -> System.out.println("30 Days");
            case 2 -> System.out.println(
                ((year%4==0 && year%100!=0)||year%400==0) ? "29 Days":"28 Days");
            default -> System.out.println("Invalid Month");
        }
    }
}
