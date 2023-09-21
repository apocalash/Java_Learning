//program to demonstrate the default and protected access specifiers
package access_specifiers;
import java.util.Scanner;

class Student{
    int roll;
    protected int eng;
    protected int math;
};

class Result extends Student{
    private int total;
    private float per;

    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Roll: ");
        roll=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter English: ");
        eng=sc.nextInt();
        System.out.print("Enter Math: ");
        math=sc.nextInt();
    }
    public void calculate(){
        total=eng+math;
        per=(total/200.0f)*100;
    }
    void show(){
        System.out.println("Roll: " + roll);
        System.out.println("English: " + eng);
        System.out.println("Math: " + math);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + per);
    }
}

public class example{
    public static void main(String[] args){
        Result x=new Result();
        x.input();
        x.calculate();
        x.show();
    }
}