import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle rectangle;
    @BeforeEach
    void setup(){
        rectangle = new Rectangle();
    }

    @Test
    void getandsetLength() {
        double length = 10.0D;
        rectangle.setLength(length);
        assertEquals(length,rectangle.getLength(),0.01);
    }

    @Test
    void getandsetWidth() {
        double width = 10.0D;
        rectangle.setWidth(width);
        assertEquals(width,rectangle.getWidth(),0.01);
    }


    @Test
    void getArea() {
        double length = 10.0;
        double width = 5.0;
        rectangle.setLength(length);
        rectangle.setWidth(width);
        double expectedArea = length * width;
        assertEquals(expectedArea, rectangle.getArea(length,width), 0.01);
    }
}