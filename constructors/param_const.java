package constructors;

public class param_const {
    int id;
    String name;
    param_const(int id, String name){
        this.id = id;
        this.name = name;
    }
    void display(){
        System.out.println("Id:"+this.id+" Name:"+this.name);
    }
    public static void main(String[] args){
        param_const obj1 = new param_const(1,"Ram");
        param_const obj2 = new param_const(2,"Shyam");
        obj2.display();
        obj1.display();
    }

}
