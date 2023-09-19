package constructors;

public class overloading {
    String lang;
    overloading(){
        this.lang = "java";
    }
    overloading(String lang){
        this.lang = lang;
    }
    void display(){
        System.out.println("language="+this.lang);
    }
    public static void main(String[] args){
        overloading object1 = new overloading();
        overloading object2 = new overloading("python");
        object1.display();
        object2.display();
    }
}
