package org.example;

public class Student extends User implements Reader, Supplier {
    public int bookCount;
    public String name;
    public Student (String name, int bookCount) {
        super(name, bookCount);
        this.bookCount = bookCount;
        this.name = name;
    }


    @Override
    public int getBookCount() {
        return bookCount;
    }

    @Override
    public void setBookCount(int bookCount) {
        this.bookCount = bookCount;
    }

    @Override
    public int takeBook(Administrator administrator) {
        int bookNum = administrator.getBookCount();
        bookNum--;
        administrator.setBookCount(bookNum);
        this.bookCount++;
        System.out.println("Reader " + this.name + " took the book '1942' from Administrator " + administrator);
        System.out.println(administrator + " has " + administrator.getBookCount() + " books");
        System.out.println("Reader " + this.name + " has " + this.bookCount + " books");
        System.out.println(" ");

        return administrator.getBookCount();
    }

    @Override
    public int bringBookback(Administrator administrator) {
        int bookNum = administrator.getBookCount();
        bookNum++;
        this.bookCount--;
        System.out.println("Reader " + this.name + " gave the book '1942' back to Administrator " + administrator);
        System.out.println((administrator + " has " + bookNum) + " books");
        System.out.println("Reader " + this.name + " has " + this.bookCount + " books");
        System.out.println(" ");

        return bookNum;
    }

    @Override
    public int bringNewBook(Librarian librarian) {
        this.bookCount--;
        int bookNum = librarian.getBookCount();
        bookNum++;

        System.out.println("Supplier " + this.name + " brought a new book to Librarian " + librarian);
        System.out.println((librarian + " has " + bookNum + " books"));
        System.out.println("Supplier " + this.name + " has " + this.bookCount + " books");
        System.out.println(" ");

        return bookNum;
    }




}
