package Abstract.banking;

abstract class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    protected void setBalance(double balance){
        this.balance = balance;
    }
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount{
    public SavingsAccount(String accountNumber, double balance){
        super(accountNumber,balance);
    }
    @Override
    public void deposit(double amount) {
     setBalance(getBalance()+amount);
     System.out.println("Deposit of "+amount+" successful.\nCurrent balance: "+getBalance());
     System.out.println("*****************\n");
    }
    @Override
    public void withdraw(double amount) {
        if(getBalance()>=amount){
            setBalance((getBalance()-amount));
            System.out.println("Withdrawal of "+amount+"is successful.\nCurrent Balance: "+getBalance());
            System.out.println("*****************\n");
        }
        else {
            System.out.println("Insufficient funds");
            System.out.println("*****************\n");
        }
    }
}

class CurrentAccount extends BankAccount{
    public CurrentAccount(String accountNumber, double balance){
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance()+amount);
        System.out.println("Deposit of "+amount+"is successful.\nCurrent Balance: "+getBalance());
        System.out.println("*****************\n");
    }

    @Override
    public void withdraw(double amount) {
        if(getBalance()>=amount){
            setBalance((getBalance()-amount));
            System.out.println("Withdrawal of "+amount+"is successful.\nCurrent Balance: "+getBalance());
            System.out.println("*****************\n");
        }
        else {
            System.out.println("Insufficient funds");
            System.out.println("*****************\n");
        }

    }
}

