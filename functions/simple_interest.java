//program to calculate the simple interest
package functions;
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;
public class simple_interest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter principle");
        float princple = sc.nextFloat();
        System.out.println("enter interest");
        float interest = sc.nextFloat();
        System.out.println("enter time period");
        float time = sc.nextFloat();

        System.out.println("the simple intertest is= "+calc_si(princple,interest,time));
    }

    private static float calc_si(float princple, float interest, float time) {
        float si = 0.0F;
        si = (float) ((princple*interest*time)/100.0);
        return si;
    }
}
