package org.example;

public class User implements General {
    public int bookCount;
    public String name;

    public User(String name, int bookCount) {
        this.bookCount = bookCount;
        this.name = name;
    }



    public String toString() {
        return name;
    }

    @Override
    public int getBookCount() {
        return bookCount;
    }
    @Override
    public void setBookCount(int bookCount) {
        this.bookCount = bookCount;
    }

}
