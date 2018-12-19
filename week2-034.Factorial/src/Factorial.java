import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i = 1;
        int fac = 1;
        
        System.out.println("Type a number: ");
        int n = Integer.parseInt(reader.nextLine());
        
        while(i <= n){
            fac *= i;
            i++;
        }
        System.out.println("Factorial is " + fac);
    }
}
