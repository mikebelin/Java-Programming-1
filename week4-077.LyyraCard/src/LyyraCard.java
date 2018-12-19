public class LyyraCard {
    private double balance;
    
    //gets starting balance of the card as parameter
    public LyyraCard(double balanceAtStart){
        balance = balanceAtStart;
    }
    //returns a string with card balance
    public String toString(){
        return "The card has " + balance + " euros";
    }
    //method decreases balance by 2.5 euros
    public void payEconomical(){
        if(this.balance >= 2.5)
          this.balance -= 2.5;
    }
    //method decreases balance by 4 euros
    public void payGourmet(){
        if(this.balance >= 4.0)
          this.balance -=4.0;
    }
    //card balance is increased by a given amount
    public void loadMoney(double amount){
        if(this.balance < 150 && amount > 0){
          this.balance += amount;
        }
        if(this.balance >= 150) {
           this.balance = 150;
        }
        
    }
}
