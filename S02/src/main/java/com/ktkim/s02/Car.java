package com.ktkim.s02;

import sun.util.resources.cldr.or.CurrencyNames_or;

public class Car implements TaxImposable
{
    String birthDate;
    int price;

    Car()
    {
        birthDate = "unknown";
    }

    Car(int _price)
    {
        price = _price;
    }

    Car(String _birthDate, int _price)
    {
        birthDate = _birthDate;
        price = _price;
    }

    String getBirthDate()
    {
        return birthDate;
    }

    @Override
    public int getPrice()
    {
        return  price;
    }

    @Override
    public int getTaxCode()
    {
        return TaxImposable.CODE_CAR;
    }
}

class Sonata extends Car
{
    Sonata(String _birthDate, int _price)
    {
        super(_birthDate, _price);
    }
}

class Impala extends Car
{
    Impala(String _birthDate, int _price)
    {
        super(_birthDate, _price);
    }
}

class Cayenne extends Car
{
    Cayenne(String _birthDate, int _price)
    {
        super(_birthDate, _price);
    }
}

class R8 extends Car
{
    R8(int _price)
    {
        super();

        price = _price;
    }
}
