
public class Accounts {

    public static void main(String[] args) {
        Account newA = new Account ("A", 100);
        Account newB = new Account ("B", 0);
        Account newC = new Account ("C", 0);
        
        transfer(newA, newB, 50);
        transfer(newB, newC, 25);
    }
    
    public static void transfer(Account from, Account to, double howMuch){
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }

}
