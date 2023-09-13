public class SavingAccount {
    int balance;

    public SavingAccount(int initialBalance){
        balance = initialBalance;
    }
    public void checkBalance(){
        System.out.println("greetings!");
        System.out.println("your balance is " + balance);
    }
    public void deposit(int amountToDeposit){
        balance = amountToDeposit + balance;
        
    }
    public int withdraw(int amountToWithdraw){
        balance -= amountToWithdraw;
        System.out.println("You just withdrew " + amountToWithdraw);
        return amountToWithdraw;
    }
    public String toString(){
        return "This is a saving Account which has " + balance + " saved.";
    }

        public static void main(String[] args) throws Exception {
            SavingAccount MyAccount = new SavingAccount(300000);
            MyAccount.checkBalance();
            MyAccount.withdraw(300);
            MyAccount.checkBalance();
            MyAccount.deposit(4000);
            MyAccount.checkBalance();
            MyAccount.withdraw(300000);
            MyAccount.checkBalance();
            System.out.println(MyAccount);
    }
}