//program to show the difference in static and public method invocation
package static_keyword;

public class example4 {
    static void myStaticMethod() {
        System.out.println("accessed without object: static");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("accessed using objects: public");
    }

    // Main method
    public static void main(String[] args) {
        myStaticMethod();
        example4 object = new example4();
        object.myPublicMethod();
    }
}