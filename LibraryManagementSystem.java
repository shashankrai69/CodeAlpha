import java.util.*;

class Book {
    String title;
    String author;
    int id;
    boolean isAvailable;

    public Book(String title, String author, int id) {
        this.title = title;
        this.author = author;
        this.id = id;
        this.isAvailable = true;
    }
}

class Library {
    ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(int id) {
        for (Book book : books) {
            if (book.id == id) {
                books.remove(book);
                return;
            }
        }
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println("Title: " + book.title + ", Author: " + book.author + ", ID: " + book.id);
        }
    }

    public void borrowBook(int id) {
        for (Book book : books) {
            if (book.id == id && book.isAvailable) {
                book.isAvailable = false;
                return;
            }
        }
    }

    public void returnBook(int id) {
        for (Book book : books) {
            if (book.id == id && !book.isAvailable) {
                book.isAvailable = true;
                return;
            }
        }
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Book 1", "Author 1", 1);
        Book book2 = new Book("Book 2", "Author 2", 2);

        library.addBook(book1);
        library.addBook(book2);

        library.displayBooks();

        library.borrowBook(1);

        library.displayBooks();
    }
}
