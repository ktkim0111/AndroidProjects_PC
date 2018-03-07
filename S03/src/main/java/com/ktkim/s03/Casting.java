package com.ktkim.s03;

public class Casting
{
    public static void main(String[] args) {
        FerrariEnzo enzo = new FerrariEnzo("enzo-1");

        //묵시적 형변환
        Object object = enzo;
        TaxImposable tax1 = enzo;

        //명시적 형변환
        Car2 car = (Car2) object;
        FerrariEnzo enzo2 = (FerrariEnzo) car;

        System.out.println(enzo == enzo2);

        //묵시적 형변환
        TaxImposable tax2 = car;

        //기본형 데이터간의 묵시적, 명시적 형변환
        int i = 1000;
        double d = i;
        int i2 = (int)d;
    }
}
