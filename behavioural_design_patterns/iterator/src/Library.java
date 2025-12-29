package behavioural_design_patterns.iterator.src;

public class Library implements Collection<Book> {
    private Book[] books;
    private int size = 0;

    public Library(int capacity) {
        books = new Book[capacity];
    }

    public void addBook(Book book) {
        if (size < books.length) {
            books[size++] = book;
        }
    }

    @Override
    public Iterator<Book> createIterator() {
        return new LibraryIterator();   
    }    
    
    private class LibraryIterator implements Iterator<Book> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public Book next() {
            return books[currentIndex++];
        }
    }
}
