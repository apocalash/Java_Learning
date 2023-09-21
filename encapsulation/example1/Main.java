package encapsulation.example1;

class Person{
    private String name;
    private int age;
    private String country;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getCountry(){
        return country;
    }
    public void setCountry(String country){
        this.country = country;
    }
}

public class Main {
    public static void main(String[] args){
        Person person = new Person();
        person.setName("mohan");
        person.setAge(25);
        person.setCountry("india");

        System.out.println("name of the person: "+person.getName());
        System.out.println("age of "+person.getName()+" is "+person.getAge());
        System.out.println(person.getName()+" is from "+person.getCountry());
    }
}
