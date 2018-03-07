package com.ktkim.s03mission;

import java.util.Scanner;

public class Mission6
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int money_1000 = Integer.parseInt(s);
        int coin_1000 = money_1000 / 1000;
        int money_100 = money_1000 % 1000;
        int coin_100 = money_100 / 100;
        int money_10 = money_100 % 100;
        int coin_10 = money_10 / 10;
        int coin_1 = money_10 % 10;

        System.out.printf("천원 지폐: %d", coin_1000);
        System.out.print("\n");
        System.out.printf("백원 동전: %d", coin_100);
        System.out.print("\n");
        System.out.printf("십원 동전: %d", coin_10);
        System.out.print("\n");
        System.out.printf("1원 동전: %d", coin_1);
        System.out.print("\n");
    }
}
