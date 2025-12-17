import java.util.*;
public class Lcm {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i;
        for(i=a>b ? a:b; ;i++){
            if(i % a == 0 && i % b == 0){
                System.out.println("The LCM is: "+i);
                break;
            }
        }
    }
}
