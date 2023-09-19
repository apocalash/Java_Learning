package inheritence.hierarchial;

class Parent
{
    public void print_parent()
    {
        System.out.println("In ::Parent class");
    }
}
//child1 class
class Child1 extends  Parent
{
    public void print_child1()
    {
        System.out.println("In ::Child1 class");
    }
}
//child2 class
class Child2 extends Parent
{
    public void print_child2()
    {
        System.out.println("In ::Child2 class");
    }
}
//child3 class
class Child3 extends Parent
{
    public void print_child3()
    {
        System.out.println("In ::Child3 class");
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Child1 ch1 = new Child1();      //create a Child1 class object
        ch1.print_child1();             //call its member method
        Child2 ch2 = new Child2();      //create a Child2 class object
        ch2.print_child2();             //call its member method
        Child3 ch3 = new Child3();      //create a Child3 class object
        ch3.print_child3();             //call its member method
        ch3.print_parent();             //call parent class method with any object
    }
}