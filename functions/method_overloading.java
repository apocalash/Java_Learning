//program to depict the use and working of method overloading
package functions;

public class method_overloading {
    public static void main(String[] args){
        System.out.println("Sum of two integers: "+ sum(10,20));
        System.out.println("Sum of integer and float: " +sum(10, 5.6F));
        System.out.println("Sum of two float: "+sum(2.3F,5.8F));
    }

    private static int sum(int i, int i1) {
        return i+i1;
    }
    private static float sum(int i, float i1) {
        return i+i1;
    }
    private static float sum(float i, float i1) {
        return i+i1;
    }
}

