//program to show running of vehicle
package inheritence.Vehicle;

public class Main {
    public static void main(String[] args){
        vehicle vehicle = new vehicle();
        Car car = new Car();
        vehicle.drive();
        car.drive();
    }
}
