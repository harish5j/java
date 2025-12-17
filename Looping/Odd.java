import java.util.*;
public class Odd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int end = sc.nextInt();
        for(int i=1;i<=end;i++){
        if(i%2==0)continue;
        System.out.print(i);
        }
    }
}