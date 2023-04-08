package org.example;

public interface Administrator extends General {
    void overdueNotification(Reader reader);
    int giveBook(Reader reader);
}
