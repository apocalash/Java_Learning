package inheritence.single_inht;

class A{
    int a,b;
    void display(){
        System.out.println("inside parent class A "+a+","+b);
    }
}
class B extends A{
    int c;
    void show(){
        System.out.println("inside child class B "+a+","+b+","+c);
    }
}
public class single {
    public static void main(String[] args){
        B obj = new B();
        obj.a = 10;
        obj.b=20;
        obj.c=30;
        obj.display();
        obj.show();
    }
}
