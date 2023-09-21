//program to show the use of static method - used to change the value of the static variable
package static_keyword;

class College{
    int rollno;
    String name;
    static String college = "BITS";
    static void change(){
        college = "KITS";
    }
   College(int r, String n){
        rollno = r;
        name = n;
    }
    //method to display values
    void display(){System.out.println(rollno+" "+name+" studies at "+college);}
}
//Test class to create and display the values of object
public class example2{
    public static void main(String[] args){
        College.change();//calling change method
        //creating objects
        Student s1 = new Student(111,"basil");
        Student s2 = new Student(222,"shaun");
        Student s3 = new Student(333,"ram");
        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}