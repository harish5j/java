import java.util.*;
public class SingleOrDoubleOrTripleDigit {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        if(a<10){
            System.out.print("The number is single digit");
        }
        if(a<100){
            System.out.println("The number is double digit");
        }
        if(a<1000){
            System.out.println("The number is triple digit");
        }
        else{
            System.out.println("More than Triple digit");
        }
    }
}
