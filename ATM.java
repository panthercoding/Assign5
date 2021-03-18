public class ATM{
  private double balance;

  public ATM(double balance){
    this.balance = balance;
  }
  public void withdraw(double amount){
    if (amount <= balance){
      balance = balance - amount;
    }
    else{
      System.out.println("Withdraw Unsuccessful: Insufficient Funds");
    }
  }
  public double getBalance(){
    return(balance);
  }
}