import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    private Book book1;
    private Book book2;
    @BeforeEach
    void setUp(){
        book1 = new Book("Wings of Fire", "Abdul Kalam", "98725461746");
        book2 = new Book("Intro to CS", "Mariam Jacob", "9826758271");
    }

    @Test
    void add_Book() {
        ArrayList<Book> bookCollection = Book.get_BookCollection();

        assertEquals(0,bookCollection.size());

        Book.add_Book(book1);
        Book.add_Book(book2);

        assertTrue(bookCollection.contains(book1));
        assertTrue(bookCollection.contains(book2));

    }

    @Test
    void remove_Book() {
        ArrayList<Book> bookCollection = Book.get_BookCollection();

        // Add book1 and book2 to the collection
        Book.add_Book(book1);
        Book.add_Book(book2);

        // Check if books are in the collection
        assertTrue(bookCollection.contains(book1));
        assertTrue(bookCollection.contains(book2));

        // Remove book1
        Book.remove_Book(book1);

        // Check if book1 has been removed, but book2 is still there
        assertFalse(bookCollection.contains(book1));
        assertTrue(bookCollection.contains(book2));
    }
}