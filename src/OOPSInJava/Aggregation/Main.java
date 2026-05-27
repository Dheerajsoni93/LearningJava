package OOPSInJava.Aggregation;

public class Main {
    public static void main(String[] args) {
        // Aggregation = Represents a "has-a" relationship between objects.
        //               One object contains another object as part of its structure,
        //               but the contained object/s can exist independently.

        Book book1 = new Book("Harry Potter and the Philosopher's Stone", 223);
        Book book2  = new Book("Harry Potter and the Chamber of Secrets", 309);
        Book book3 = new Book("The Fellowship of the ring", 423);

        Book[] books = {book1, book2, book3};

//        for(Book book : books){
//            book.displayInfo();
//        }

        Library library = new Library("Delhi Public Library", 1951, books);

        library.displayInfo();
    }
}
