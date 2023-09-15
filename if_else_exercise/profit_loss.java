//program to calculate profit or loss
package if_else_exercise;
import java.util.Scanner;
public class profit_loss {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float cp = sc.nextFloat();
        float sp = sc.nextFloat();

        float profit, loss;

        if(cp>sp){
            loss = cp-sp;
            System.out.println("Loss="+loss);
        }
        else if(sp>cp){
            profit = sp-cp;
            System.out.println("profit="+profit);
        }
        else
            System.out.println("break even");
    }

}
