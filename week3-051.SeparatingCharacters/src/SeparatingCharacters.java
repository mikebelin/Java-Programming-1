
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine(); 
        
        int length = name.length();
        int i = 1;
        
        while(i <= length){
            char letter = name.charAt(i-1);
            System.out.println(i + ". character: " + letter);
            i++;
        }
    }
}
