package inheritence.Vehicle;

class vehicle {
    public void drive(){
        System.out.println("driving a vehicle");
    }
}

class Car extends vehicle{
    @Override
    public void drive(){
        System.out.println("driving a car");
    }
}