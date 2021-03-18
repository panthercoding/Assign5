public class ATMTester{
  public static void main(String[] args){

    ATM atm1 = new ATM(30);
    atm1.withdraw(10);
    atm1.withdraw(15);
    atm1.withdraw(6);
    System.out.print(atm1.getBalance());

  }
}