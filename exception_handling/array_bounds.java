//exception handling of an array out of bounds
package exception_handling;

public class array_bounds {
    public static void main(String[] args){
        int[] array = {1,2,3,4};
        try{
            System.out.println(array[10]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("array out of bounds"+e.getMessage());
        }
        finally {
            System.out.println("finally block");
        }
    }
}
