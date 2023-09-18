package objects_classes;
import java.util.Scanner;
public class banking {
    public static void main(String[] args){
        BankAcc object1 = new BankAcc();
        object1.calc();
    }
}

class BankAcc{
    int principle, interest, time;
    void calc(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter principle, rate and time period");
        principle = sc.nextInt();
        interest = sc.nextInt();
        time = sc.nextInt();

        Interest object2 = new Interest();
        object2.display();
    }

    class Interest{
        void display(){
            int si = (principle*interest*time) / 100;
            System.out.println(si);
        }
    }
}
