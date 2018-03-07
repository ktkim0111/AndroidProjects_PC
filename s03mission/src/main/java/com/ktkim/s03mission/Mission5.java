package com.ktkim.s03mission;

import java.util.Scanner;

public class Mission5
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.next();
        String s2 = scan.next();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        double c = Math.sqrt(a*a + b*b);
        System.out.printf("밑변 %d, 높이 %d인 직각삼각형의 대각선 길이 %.2f",a,b,c);
    }

}

