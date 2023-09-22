package exception_handling;

import org.junit.jupiter.params.aggregator.ArgumentAccessException;

public class nested_try {
    public static void main(String[] args){
        try{
            try{
                int a = 5/0;
            }
            catch(ArithmeticException e){
                System.out.println("cant divide number by 0");
            }
            try{
                int[] arr = {1,2,3};
                System.out.println(arr[10]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            }
        }
        catch (Exception e){
            System.out.println("other execptions: "+e.getMessage());
        }
        finally {
            System.out.println("finally block..");
        }
    }
}
