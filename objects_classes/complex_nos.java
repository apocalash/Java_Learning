//program to calculate the sum, difference and product of 2 complex numbers
package objects_classes;
import java.util.Scanner;

class Complex{
    int real;
    int img;
    public Complex(int r, int i){
        real = r;
        img =i;
    }
    public static Complex add(Complex a, Complex b){
        return new Complex((a.real+b.real),(a.img+b.img));
    }
    public static Complex diff(Complex a, Complex b){
        return new Complex((a.real-b.real),(a.img-b.img));
    }
    public static Complex prod(Complex a, Complex b){
        return new Complex((a.real*b.real),(a.img*b.img));
    }
    public void print(){
        if(real == 0 && img !=0)
            System.out.println(img+"i");
        else if(img == 0 && real != 0)
            System.out.println(real);
        else
            System.out.println(real+"+"+img+"i");
    }
}
public class complex_nos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the real part of 1");
        int real_1 = sc.nextInt();
        System.out.println("enter the imaginary part of 1");
        int img_1 = sc.nextInt();
        System.out.println("enter the real part of 2");
        int real_2 = sc.nextInt();
        System.out.println("enter the imaginary part of 2");
        int img_2 = sc.nextInt();

        Complex object1 = new Complex(real_1,img_1);
        Complex object2 = new Complex(real_2,img_2);

        Complex ob1 = Complex.add(object1,object2);
        Complex ob2 = Complex.diff(object1,object2);
        Complex ob3 = Complex.prod(object1,object2);

        ob1.print();
        ob2.print();
        ob3.print();
    }
}
