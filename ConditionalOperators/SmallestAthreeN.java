import java.util.*;
public class SmallestAthreeN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if((a<b)&&(a<c)){
            System.out.print("The First Number is Smaller");
        }
        else if(b<c){
            System.out.println("The Second Number is Smaller");
        }
        else{
            System.out.println("The Third Number is Smaller");
        }
    }
}
