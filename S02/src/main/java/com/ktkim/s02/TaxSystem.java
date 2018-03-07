package com.ktkim.s02;

public class TaxSystem
{
    public static void main(String[] args) {
        TaxImposable sonata = new Sonata("20140101", 1000);
        TaxImposable impala = new Sonata("20140102", 1500);
        TaxImposable cayenne = new Sonata("20140103", 2000);

        System.out.println("쏘나타 과세코드: " + sonata.getTaxCode());
        System.out.println("임팔라 과세코드: " + impala.getTaxCode());
        System.out.println("카이엔 과세코드: " + cayenne.getTaxCode());
    }
}
