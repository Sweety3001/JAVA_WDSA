class Account{
  // private int AccountNumber;
  private int Balance;

  public int getBalance(){
    return this.Balance;
  }
   public void setBalance(int b){
    this.Balance=b;
   }

}
class Bank {
  public static void main(String[] args) {
    Account b=new Account();
    b.setBalance(10000);
    int amt=b.getBalance();
    System.out.println("Current Balance: "+amt);
    
  }
}

