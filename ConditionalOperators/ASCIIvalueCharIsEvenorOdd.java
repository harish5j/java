import java.util.*;
public class ASCIIvalueCharIsEvenorOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0); 
        int ascii = ch;
        if(ascii%2==0){
            System.out.print("The ascii character is even");
        }
        else{
            System.out.println("The ascii character is odd");
        }
    }
}
