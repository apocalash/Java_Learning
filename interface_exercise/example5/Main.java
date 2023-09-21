//program to demonstrate multiple interface implementation
package interface_exercise.example5;

interface Car{
    void print();
}

interface Bike{
    void show();
}

class Road implements Car, Bike{
    public void print(){
        System.out.println("Car runs on the road");
    }
    public void show(){
        System.out.println("Bike runs on the road");
    }
}

public class Main{

    public static void main(String[] args){
        Road road = new Road();
        road.print();
        road.show();
    }
}