
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        
        while(true){
        System.out.println("Please add temperature measurements: ");
        double temp = Double.parseDouble(reader.nextLine());
        
        if(temp >= 40 || temp <=-30){
            System.out.println("This measuement will be disregarded");
        }else{
            Graph.addNumber(temp);
         
            }
        }
        // Graph is used as follows:
        /* Graph.addNumber(7);
        double value = 13.5;
        Graph.addNumber(value);
        value = 3;
        Graph.addNumber(value);
        */
    }
}