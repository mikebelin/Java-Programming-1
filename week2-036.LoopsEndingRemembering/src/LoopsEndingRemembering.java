
import java.util.Scanner;

public class LoopsEndingRemembering {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int stopper = -1;
        int counter = 0;
        double avg = 0;
        int even = 0, odd = 0;

        System.out.println("Type numbers: ");
        int number = Integer.parseInt(reader.nextLine());

        while(number != stopper) {
            sum += number;
            counter++;
            avg = (double)sum / counter;
            
            if(number % 2 == 0){
                even++;
            }else {
                odd++;
            }
            number = Integer.parseInt(reader.nextLine());   
        }
            System.out.println("Thank you and see you later!");
            System.out.println("The sum is: " + sum);
            System.out.println("How many numbers: " + counter);
            System.out.println("Average: " + avg);
            System.out.println("Even: " + even);
            System.out.println("Odd: " + odd);
    }
}
