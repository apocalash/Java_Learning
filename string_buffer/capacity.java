//program to check the capacity of the string buffer
package string_buffer;

public class capacity {
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("Hello");
        System.out.println(sb.capacity());
        sb.append("Good Morning. How are you? ");
        System.out.println(sb.capacity());
    }
}
