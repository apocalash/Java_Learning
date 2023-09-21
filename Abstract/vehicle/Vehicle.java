package Abstract.vehicle;

abstract class Vehicle {
    public abstract void startEngine();
    public abstract void stopEngine();
}

class Car extends Vehicle{

    @Override
    public void startEngine() {
        System.out.println("Car: Starting the engine..");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car: Stopping the engine");
    }
}

class Motorcycle extends Vehicle{

    @Override
    public void startEngine() {
        System.out.println("Motocycle: Starting the engine...");
    }

    @Override
    public void stopEngine() {
        System.out.println("Motorcycle: Stopping the engine...");
    }
}

