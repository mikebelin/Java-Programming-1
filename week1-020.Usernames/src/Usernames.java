
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
    String userOne = "alex";
    String userTwo = "emily";
    
    String pswrdOne = "mightyducks";
    String pswrdTwo = "cat";
    
    System.out.println("Type your username: ");
    String userName = reader.nextLine();
    
    System.out.println("Type your password: ");
    String userPassword = reader.nextLine();
    
    if(userName.equals(userOne) && userPassword.equals(pswrdOne)){
        System.out.println("You are logged into the system!");
    }else if (userName.equals(userTwo) && userPassword.equals(pswrdTwo)){
        System.out.println("You are logged into the system!");
    }else {
        System.out.println("Your username or password was invalid!");
    }
    }
}
