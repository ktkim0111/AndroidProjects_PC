package com.ktkim.s03;

public class Overriding {
    public static void main(String[] args) {
        FerrariEnzo ferrariEnzo = new FerrariEnzo("enzo-1");
        BMW730d bmw730d = new BMW730d("730d-1");
        BentleyGT bentleyGT = new BentleyGT("gt-1");

        System.out.println(ferrariEnzo.getSerialNumber());
        System.out.println(bmw730d.getSerialNumber());
        System.out.println(bentleyGT.getSerialNumber());
    }
}
