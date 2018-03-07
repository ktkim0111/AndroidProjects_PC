package com.ktkim.s02;

public class Inheritancce
{
    public static void main(String[] args) {
        Sonata sonata = new Sonata("20140101", 1000);
        Impala impala = new Impala("20140102", 1500);
        Cayenne cayenne = new Cayenne("20140103", 2000);
        R8 r8 = new R8(5000);

        System.out.println("쏘나타 가격: " + sonata.getPrice());
        System.out.println("임팔라 가격: " + impala.getPrice());
        System.out.println("카이엔 가격: " + cayenne.getPrice());
        System.out.println("R8 가격: " + r8.getPrice());
        System.out.println("R8 출시일: " + r8.getBirthDate());
    }
}
