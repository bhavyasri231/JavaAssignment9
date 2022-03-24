import java.util.regex.*;
import java.util.Scanner;

public class JavaAssignment9 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        if(Pattern.matches("[A-Z][A-za-z\\s0-9$&+,:;=?@#|'<>.-^*()%!]*\\.",sentence))
        {
            System.out.println("The sentence starts with Capital letter and ends with period");
        }
        else
        {
            System.out.println("The sentence is not obeying the pattern");
        }




    }
}
