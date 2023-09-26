import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student object = new Student();

    @Test
    void remove() {
        object.add("Antonio");
        object.add("Paul");
        object.remove("Paul");
        assertEquals( 1, object.sizeofstudents());
    }

    @Test
    void add() {
        object.add("johan");
        object.add("ram");
        object.add("mohan");
        assertEquals(3,object.sizeofstudents());
    }

    @Test
    void removeall() {
        object.removeall();
    }

    @Test
    void sizeofstudents() {
        object.add("johan");
        object.add("ram");
        object.add("mohan");
        assertEquals(3,object.sizeofstudents());
    }
}