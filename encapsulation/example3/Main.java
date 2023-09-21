//program to output employee salary details
package encapsulation.example3;
import java.util.Scanner;
class Employee {
    private int employee_id;
    private String employee_name;
    private double employee_salary;
    double hra = 0.2D;
    double gra = 0.10D;

    public int getEmployeeId() {
        return employee_id;
    }

    public void setEmployeeId(int employeeId) {
        this.employee_id = employeeId;
    }

    public String getEmployeeName() {
        return employee_name;
    }

    public void setEmployeeName(String employeeName) {
        this.employee_name = employeeName;
    }

    public double getEmployeeSalary(double employee_salary) {
        double current_hra = employee_salary * hra;
        double current_gra = employee_salary * gra;
        return employee_salary + current_gra +current_hra;
    }
}

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double salary;
        int emp_id;
        String name;
        System.out.println("Enter the name, employee id and base salary");
        name = sc.nextLine();
        emp_id = sc.nextInt();
        salary = sc.nextDouble();

        Employee employee = new Employee();
        employee.setEmployeeId(emp_id);
        employee.setEmployeeName(name);

        System.out.println("Employee details\n*******");
        System.out.println("Name: "+ employee.getEmployeeName());
        System.out.println("ID: "+employee.getEmployeeId());
        System.out.println("Base Salary before allowances: "+ salary);
        System.out.println("Total salary after allowances: "+employee.getEmployeeSalary(salary));
    }
}

