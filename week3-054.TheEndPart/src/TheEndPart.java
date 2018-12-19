import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a word: ");
        String word = reader.nextLine(); 
        
        System.out.println("Length of the last part: ");
        int letters = Integer.parseInt(reader.nextLine());
        int res = word.length() - letters; 
        
        System.out.println("Result: " + word.substring (res));
    }
}
