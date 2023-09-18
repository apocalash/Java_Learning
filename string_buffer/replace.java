//program to replace string with another usng string buffer
package string_buffer;

public class replace {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("NDH");
        sb.replace(2, 3, "60101");
        System.out.println(sb);
    }
}
