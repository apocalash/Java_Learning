//program to display the details of employees
package inheritence.employee;
import java.util.Scanner;

abstract class Person {
    private String first_name;
    private String last_name;

    public Person(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }
}

class Employee extends Person{
    private int emp_id;
    private String title;
    public Employee(String first_name, String last_name, int emp_id, String title){
        super(first_name, last_name);
        this.emp_id = emp_id;
        this. title = title;
    }
    public int getId(){
        return emp_id;
    }
    public String getTitle(){
        return title;
    }
    @Override
    public String getLast_name(){
        return super.getLast_name()+","+ title;
    }

}
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first name, last name, id & job title");
        String first = sc.next();
        String last = sc.next();
        int id = sc.nextInt();
        String title = sc.next();
        Employee employee1 = new Employee(first, last, id, title);
        System.out.println(employee1.getFirst_name() + " " + employee1.getLast_name()+ " (" + employee1.getId() + ")");
    }
}
