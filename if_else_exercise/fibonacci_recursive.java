//program to recursively find the fibonacci series
package if_else_exercise;

public class fibonacci_recursive {
    static  int n1=0, n2=1,n3;
    static void printSeries(int count){
       if(count>0){
            n3 = n2+n1;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
            printSeries(count-1);
        }
    }

    public static void main(String [] args){
        int count =10;
        System.out.print(n1+" "+n2);
        printSeries(count-2);
    }
}
