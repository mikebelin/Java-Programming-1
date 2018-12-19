
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int beginning = 1;
        
        System.out.println("Up to what number?");
        int number = Integer.parseInt(reader.nextLine());
        
        while(beginning <= number){
            System.out.println(beginning);
            beginning++;
        }
        
    }
}
