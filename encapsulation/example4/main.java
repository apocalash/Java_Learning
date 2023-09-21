package encapsulation.example4;

class Student {
    private int Student_Id;
    private String name;
    public int getId() {
        return Student_Id;
    }
    public void setId(int s_id) {
        this.Student_Id = s_id;
    }
    public String getname() {
        return name;
    }
    public void setname(String s_name) {
        this.name = s_name;
    }
}
class Main{
    public static void main(String[] args) {
        Student s=new Student();
        s.setId(101);
        s.setname("ram");
        System.out.println("Student Data:" + "\nStudent ID:" + s.getId()
                + "\nStudent Name:" + s.getname());
    }
}