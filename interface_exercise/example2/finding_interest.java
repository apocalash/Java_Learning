//program to return the interest rate of various banks
package interface_exercise.example2;
import java.util.Scanner;

interface Interest{
    float interest();
}

class SBI implements Interest{
    @Override
    public float interest() {
        return 7.12F;
    }
}
class ICICI implements Interest{
    @Override
    public float interest() {
        return 6.7F;
    }
}
public class finding_interest {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       ICICI object1 = new ICICI();
       SBI object2 = new SBI();

       System.out.println("Which bank do you choose?-\n1.SBI\n2.ICICI");
       int choice = sc.nextInt();
        switch (choice) {
            case 1 -> System.out.println("Interest given by SBI is: " + object2.interest());
            case 2 -> System.out.println("Interest given by ICICI is: " + object1.interest());
            default -> System.out.println("incorrect choice");
        }
    }

}
