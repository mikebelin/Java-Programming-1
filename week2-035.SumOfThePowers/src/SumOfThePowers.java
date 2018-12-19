
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i = 0;
        int result = 0;
        int pow = 0;
        
        System.out.println("Type a number: ");
        int n = Integer.parseInt(reader.nextLine());
                
        while(i <= n){
            result = (int)Math.pow(2,i);
            i++;
            pow += result;
        }
        System.out.println("The result is " + pow);
    }
}
