//program to show the working of oops concepts - objects, classes, instances
package OOPS;

class Person{
    private String name;
    private int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
public class example1 {
    public static void main(String[] args){
        Person person1 = new Person("ram", 21);
        Person person2 = new Person("sham",34);
        System.out.println(person1.getName()+" is "+person1.getAge());
        System.out.println(person2.getName()+" is "+person2.getAge());
    }
}
