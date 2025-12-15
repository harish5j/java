import java.util.Scanner;
public class LastDigitDivByThree {
   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      int var2 = var1.nextInt();
      int var3 = Math.abs(var2 % 10);
      if (var3 % 3 == 0) {
         System.out.print("last digit of the number is divisible by 3");
      } else {
         System.out.print("last digit of the number is not divisible by 3");
      }
   }
}
