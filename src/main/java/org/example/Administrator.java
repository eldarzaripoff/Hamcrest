package org.example;

public interface Administrator extends General {
    void overdueNotification(Reader reader);
    void giveBook(Reader reader);
}
