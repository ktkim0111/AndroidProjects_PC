package com.ktkim.s03mission;

public class Mission1
{
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++)
        {
            System.out.print(i + ": ");
            for(int j = 0; j < i + 1; j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
