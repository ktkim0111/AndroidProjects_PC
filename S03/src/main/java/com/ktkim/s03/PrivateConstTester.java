package com.ktkim.s03;

class PrivateConstructor
{
    private PrivateConstructor()
    {
        System.out.println("private 생성자");
    }

    public static PrivateConstructor getInstance()
    {
        return new PrivateConstructor();
    }
}

public class PrivateConstTester
{
    public static void main(String[] args) {
        PrivateConstructor pc = null;
        pc = PrivateConstructor.getInstance();
    }
}
