package com.ktkim.s03mission;

import java.util.Scanner;

public class Mission3
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int a = Integer.parseInt(s);

        for(int i = 0; i < a; i++)
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
