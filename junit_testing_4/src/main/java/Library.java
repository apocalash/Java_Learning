//a library management application which takes in details about books and adds them to an Array List and can be fetched when required

import java.security.Signature;
import java.util.Scanner;
import java.util.ArrayList;
class Book{
    private String title;
    private String author;
    private String ISBN;
    private static ArrayList<Book> bookCollecition = new ArrayList<Book>();

    public Book(String title, String author, String ISBN){
        this.title= title;
        this.author = author;
        this.ISBN = ISBN;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public String getISBN(){
        return ISBN;
    }
    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }
    public static void add_Book(Book book){
        bookCollecition.add(book);
    }
    public static void remove_Book(Book book){
        bookCollecition.remove(book);
    }
    public static ArrayList<Book> get_BookCollection(){
        return bookCollecition;
    }

}
public class Library {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Book object1 = new Book("Wings of Fire", "Abdul Kalam", " 98725461746");
        Book object2 = new Book("Intro to CS", "Mariam Jaacob", "9826758271");
        boolean flag = true;
        while (flag) {
            System.out.println("""
                    Enter your choice:
                    1.Add book
                    2.Remove Book
                    3.Display all Books
                    4.Exit""");
            int ch = sc.nextInt();
            switch (ch) {
                case 1 -> {
                    Book.add_Book(object1);
                    Book.add_Book(object2);
                    System.out.println("Books added successfully ");
                    System.out.println("*****************\n");
                    break;
                }
                case 2 -> {
                    Book.remove_Book(object1);
                    System.out.println("after removing book1 " + object1.getTitle());
                    System.out.println("*****************\n");
                    break;
                }
                case 3 -> {
                    ArrayList<Book> bookCollection = Book.get_BookCollection();
                    System.out.println("List of Books");
                    for (Book book : bookCollection)
                        System.out.println(book.getTitle() + " by " + book.getAuthor() + " ISBN: " + book.getISBN());
                    System.out.println("*****************\n");
                    break;
                }
                case 4 -> {
                    System.out.println("Thank you.. EXITING ");
                    System.out.println("*****************\n");
                    flag = false;
                }
                default -> throw new IllegalStateException("Unexpected value: " + ch);
            }
        }
    }
}
