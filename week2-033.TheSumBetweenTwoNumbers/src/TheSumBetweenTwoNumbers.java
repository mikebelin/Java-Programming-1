
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i = 0; 
        int sum = 0;
        
        System.out.println("First: ");
        int first = Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        int last = Integer.parseInt(reader.nextLine());
        
        i = first;
        while(i <= last){
            sum += i;
            i++;
        }
       System.out.println("Sum is " + sum);
    }
}
