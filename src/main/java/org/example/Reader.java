package org.example;

public interface Reader extends General {
    int takeBook(Administrator administrator);
    int bringBookback(Administrator administrator);

}
