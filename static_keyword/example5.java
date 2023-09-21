//program to show the difference when using a static counter
package static_keyword;

class Test{
    static int counter;
    Test(){
        counter++;
        System.out.println("the value of counter is: "+counter);
    }
}
public class example5 {
    public static void main(String[] args){
        Test obj1 = new Test();
        Test obj2 = new Test();
        Test obj3 = new Test();
    }
}
