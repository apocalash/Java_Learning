//program to explain the working of interface
package interface_exercise.example1;

interface Drawable{
    void draw();
}

class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("drawing a rectangle");
    }
}

class Circle implements Drawable{
    @Override
    public void draw() {
        System.out.println("drawing a circle");
    }
}

public class example1 {
    public static void main(String[] args){
        Circle circle = new Circle();
        circle.draw();
    }
}
