import java.util.Scanner;
class CenturyYear {
    public static void main(String[] args) {
        int y = new Scanner(System.in).nextInt();

        if (y%100==0)
            System.out.println("Century Year");
        else
            System.out.println("Not a Century Year");
    }
}
