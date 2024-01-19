package Hw;

import java.util.ArrayList;


public class Library {
    private ArrayList<Book> books;
    private String title;

    public Library(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayAvailableBooks() {
        System.out.println("Доступні книги:");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book.getTitle() + " by " + book.getAuthor() + " (" + book.getYear() + ")");
            }
        }
        System.out.println("============");
        for (Book book : books) {
            if (book.getTitle().equals(title) && book.isAvailable()) {
                book.setAvailable(false);
                System.out.println("Ви позичили книгу " + book.getTitle());
                return;
            }
            System.out.println("Книга не доступна");
        }
    }
}


