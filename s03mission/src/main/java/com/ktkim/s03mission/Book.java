package com.ktkim.s03mission;

public class Book
{
    String title;
    String author;
    boolean hasHardCover;

    void printInfo()
    {
        System.out.println(title);
        System.out.println(author);
        System.out.println(hasHardCover);
    }
}

class WesternStyleBook extends Book
{
    WesternStyleBook()
    {
        hasHardCover = true;
    }
}

class PocketBook extends Book
{
    PocketBook()
    {
        hasHardCover = false;
    }
}