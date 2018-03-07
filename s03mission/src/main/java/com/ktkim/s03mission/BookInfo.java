package com.ktkim.s03mission;

public class BookInfo
{
    public static void main(String[] args) {
        WesternStyleBook westernStyleBook = new WesternStyleBook();
        PocketBook pocketBook = new PocketBook();
        westernStyleBook.printInfo();
        pocketBook.printInfo();
    }
}
