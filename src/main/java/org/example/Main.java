package org.example;

public class Main {
    public static void main(String[] args) {
        Student alex = new Student("Alex", 3);
        Bookkeeper frank = new Bookkeeper(10, "Frank");

        alex.takeBook(frank);
        alex.bringBookback(frank);

        frank.orderBook(alex);

        alex.bringNewBook(frank);

        frank.giveBook(alex);
        frank.overdueNotification(alex);


    }

}