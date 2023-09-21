//program to show the use of static variable
package static_keyword;

class Student{
    int rollno;
    String name;
    static String college ="KITS";
    //constructor
    Student(int r, String n){
        rollno = r;
        name = n;
    }
    //method to display the values
    void display (){System.out.println(rollno+" "+name+" studies at "+college);}
}
//Test class to show the values of objects
public class example1{
    public static void main(String[] args){
        Student s1 = new Student(101, "ram");
        Student s2 = new Student(102,"shyam");
        s1.display();
        s2.display();
    }
}