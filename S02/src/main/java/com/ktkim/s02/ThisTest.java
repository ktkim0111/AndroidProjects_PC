package com.ktkim.s02;

public class ThisTest
{
    public static void main(String[] args) {
        ThisTest obj = new ThisTest();

        System.out.println(obj);

        obj.printThis();
    }
    void printThis()
    {
        System.out.println(this);
    }
}
