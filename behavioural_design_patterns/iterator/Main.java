/**
 * The real problem the Iterator pattern solves:
 *
 * Without Iterator, client code must access and traverse the internal
 * structure of a collection directly:
 *
 *   for (int i = 0; i < books.length; i++) {
 *       Book book = books[i];
 *   }
 *
 * Why that's bad:
 * - Client code becomes dependent on the collection's internal structure.
 * - Changing the underlying data structure breaks existing clients.
 * - Traversal logic is duplicated across the application.
 * - Encapsulation is violated.
 *
 * The deeper issue: traversal logic is mixed with the collection's internal representation.
 *
 * Iterator pattern — core idea:
 * - Provide a standard way to traverse a collection.
 * - Hide the internal structure of the collection from the client.
 * - Decouple traversal behavior from the collection itself.
 *
 * Clients depend only on the Iterator abstraction, not on how the data is stored.
 *
 * Example usage:
 *   Iterator<Book> iterator = library.createIterator();
 *   while (iterator.hasNext()) {
 *       Book book = iterator.next();
 *       // process book
 *   }
 *
 * Important notes:
 * - Iterator centralizes traversal logic.
 * - Multiple iterators can exist for the same collection.
 * - New traversal strategies can be added without modifying client code.
 * - Follows Single Responsibility and Open/Closed Principles.
 *
 * NOTE: Use Iterator when clients need sequential access to elements
 * without exposing the collection's internal structure.
 */


package behavioural_design_patterns.iterator;

import behavioural_design_patterns.iterator.src.Book;
import behavioural_design_patterns.iterator.src.Library;
import behavioural_design_patterns.iterator.src.Iterator;

public class Main {
    public static void main(String[] args) {
        Library library = new Library(5);

        library.addBook(new Book("1984", "George Orwell"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald"));

        Iterator<Book> iterator = library.createIterator();
        while (iterator.hasNext()) {
            var book = iterator.next();
            System.out.println("Book: " + book.getTitle() + ", Author: " + book.getAuthor());
        }
    }
}
