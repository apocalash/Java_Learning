
import java.util.Scanner;
public class bank_application {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter your name and cust id");
            String name = scanner.nextLine();
            String cust_id = scanner.nextLine();
            Bank_Account obj1 = new Bank_Account(name, cust_id);
            obj1.menu();
    }
}
class Bank_Account{
    double balance;
    double prev_trans;
    String cust_name;
    String cust_id;
    Bank_Account(String cust_name, String cust_id){
        this.cust_name = cust_name;
        this.cust_id = cust_id;
    }
    void deposit(double amount){
        if(amount != 0){
            balance += amount;
            prev_trans = amount;
        }
    }
    void withdraw(double amount){
        if(amount != 0 && amount <= balance){
            balance -= amount;
            prev_trans = amount;
        }
    }

    void getPreviousTransaction(){
        if(prev_trans>0)
            System.out.println("Deposited:"+ prev_trans);
        else if(prev_trans<0)
            System.out.println("Withdrawn:"+prev_trans);
        else System.out.println("No transaction occured");
    }

    void menu(){
        char option;
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome "+cust_name);
        System.out.println("Your ID:"+cust_id);

        do{
            System.out.println("**************************************");
            System.out.println("Choose an option");
            System.out.println("\n");
            System.out.println("a) Check Balance");
            System.out.println("b) Deposit Amount");
            System.out.println("c) Withdraw Amount");
            System.out.println("d) Previous Transaction");
            System.out.println("e) Exit");
            option=sc.next().charAt(0);
            System.out.println("\n");

            switch (option) {
                case 'a' -> {
                    System.out.println("......................");
                    System.out.println("Balance =" + balance);
                    System.out.println("......................");
                    System.out.println("\n");
                }
                case 'b' -> {
                    System.out.println("......................");
                    System.out.println("Enter a amount to deposit :");
                    System.out.println("......................");
                    double amt = sc.nextDouble();
                    deposit(amt);
                    System.out.println("\n");
                }
                case 'c' -> {
                    System.out.println("......................");
                    System.out.println("Enter a amount to Withdraw :");
                    System.out.println("......................");
                    double amtW = sc.nextDouble();
                    withdraw(amtW);
                    System.out.println("\n");
                }
                case 'd' -> {
                    System.out.println("......................");
                    System.out.println("Previous Transaction:");
                    getPreviousTransaction();
                    System.out.println("......................");
                    System.out.println("\n");
                }
                case 'e' -> System.out.println("......................");
                default -> System.out.println("Choose a correct option to proceed");
            }

        }while(option!='e');

        System.out.println("Thank you for using our banking services");
    }

}
