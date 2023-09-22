//program to show the use of multiple catch block; each executed when corresponding error occurs
package exception_handling;

public class multi_catch {
    public static void main(String[] args){
        try{
            //int a = 5/0;
            int[] array = {1,2,3};
            //System.out.println(array[10]);
            String s=null;
            System.out.println(s.length());
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(Exception e)
        {
            System.out.println("Any other error"+e.getMessage());
        }
        finally {
            System.out.println("finally block");
        }
    }

}
