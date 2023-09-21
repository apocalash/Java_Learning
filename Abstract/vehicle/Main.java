//display use of abstract class by engine start and stop
package Abstract.vehicle;

public class Main {
    public static void main(String[] args){
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();
        car.startEngine();
        car.stopEngine();
        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}
