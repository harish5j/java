import java.util.Scanner;
public class AlphabetOrNot {
    public static void main(String[] args) {
        char ch = new Scanner(System.in).next().charAt(0);

        if (Character.isLetter(ch))
            System.out.println("Alphabet");
        else
            System.out.println("Not an Alphabet");
    }
}
