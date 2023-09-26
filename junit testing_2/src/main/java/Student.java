import java.util.ArrayList;

public class Student{
    private ArrayList<String> students = new ArrayList<String>();

    public void remove(String name){
        students.remove(name);
    }
    public void add(String name){
        students.add(name);
    }
    public void removeall(){
        students.clear();
    }
    public int sizeofstudents(){
        return students.size();
    }

    public static void main(String[] args){}
}