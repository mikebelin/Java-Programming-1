
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        int length = text.length();
        int i = 1;
        String result = ""; 
                
        while(i <= length){
            char letter = text.charAt(length-i);
            result = result + letter;    
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
