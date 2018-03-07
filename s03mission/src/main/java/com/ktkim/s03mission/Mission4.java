package com.ktkim.s03mission;

import java.util.Random;

public class Mission4
{
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(21);
        int b = random.nextInt(21);
        int c = random.nextInt(21);

        for(int i = 0; i < a; i++)
        {
            System.out.print("*");
        }
        System.out.print(": " + a);
        System.out.print("\n");
        for(int i = 0; i < b; i++)
        {
            System.out.print("*");
        }
        System.out.printf(": %d", b);
        System.out.print("\n");
        for(int i = 0; i < c; i++)
        {
            System.out.print("*");
        }
        System.out.printf(": %d", c);
        System.out.print("\n");
    }
}
