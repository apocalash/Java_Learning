package Abstract.banking;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        double initial_balance, deposit_amt, withdraw_amt;
        String account_number;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your account number");
        account_number = sc.next();
        System.out.println("enter the initial balance");
        initial_balance = sc.nextDouble();
        System.out.println("*****************");

        System.out.println("Savings Account");
        SavingsAccount savingsAccount = new SavingsAccount(account_number,initial_balance);
        System.out.println("enter the deposit amount");
        deposit_amt = sc.nextDouble();
        savingsAccount.deposit(deposit_amt);
        System.out.println("enter the withdraw amount");
        withdraw_amt = sc.nextDouble();
        savingsAccount.withdraw(withdraw_amt);
        System.out.println("*****************");

        System.out.println("Current Account");
        CurrentAccount currentAccount = new CurrentAccount(account_number, initial_balance);
        System.out.println("enter the deposit amount");
        deposit_amt = sc.nextDouble();
        currentAccount.deposit(deposit_amt);
        System.out.println("enter the withdraw amount");
        withdraw_amt = sc.nextDouble();
        currentAccount.withdraw(withdraw_amt);
    }

}
