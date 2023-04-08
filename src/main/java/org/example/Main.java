package org.example;

public class Main {
    public static void main(String[] args) {
        Student alex = new Student("Alex", 10);
        Bookkeeper frank = new Bookkeeper(20, "Frank");

        frank.setBookCount(alex.takeBook(frank));

        frank.setBookCount(alex.bringBookback(frank));

        alex.setBookCount(frank.orderBook(alex));

        frank.setBookCount(alex.bringNewBook(frank));

        alex.setBookCount(frank.giveBook(alex));

        frank.overdueNotification(alex);


    }

}