package org.example;

public class Bookkeeper extends User implements Librarian, Administrator {
    int bookCount;
    String name;
    public Bookkeeper (int bookCount, String name) {
        super(name, bookCount);
        this.bookCount = bookCount;
        this.name = name;
    }
    @Override
    public void orderBook(Supplier supplier) {
        this.bookCount++;
        int bookNum = supplier.getBookCount();
        bookNum--;
        System.out.println("Librarian " + this.name + " ordered the book '1942' from Supplier " + supplier);
        System.out.println(supplier + " has " + bookNum + " books");
        System.out.println("Librarian " + this.name + " has " + this.bookCount + " books");
        System.out.println(" ");
        supplier.setBookCount(bookNum);
    }

    @Override
    public void overdueNotification(Reader reader) {
        System.out.println("Administrator " + this.name + " gave the notice about over due to Reader " + reader);
        System.out.println(" ");
    }

    @Override
    public void giveBook(Reader reader) {
        this.bookCount--;
        int bookNum = reader.getBookCount();
        bookNum++;
        System.out.println("Administrator " + this.name + " gave the book '1942' to Reader " + reader);
        System.out.println(reader + " has " + bookNum + " books");
        System.out.println("Administrator " + this.name + " has " + this.bookCount + " books");
        System.out.println(" ");
        reader.setBookCount(bookNum);
    }

}
