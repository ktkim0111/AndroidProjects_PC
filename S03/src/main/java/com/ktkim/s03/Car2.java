package com.ktkim.s03;

public abstract class Car2 implements TaxImposable
{
    String birthDate = "20150914";
    String serialNumber;

    String getBirthDate()
    {
        return birthDate;
    }

    String getSerialNumber()
    {
        return serialNumber;
    }

    @Override
    public final int getTaxCode()
    {
        return TaxImposable.CODE_CAR;
    }

    @Override
    public abstract int getPrice();
}

class FerrariEnzo extends Car2 {
    FerrariEnzo(String _serialNumber)
    {
        serialNumber = _serialNumber;
    }

    @Override
    public int getPrice() {
        return 1000;
    }
}

class BMW730d extends Car2 {
    BMW730d(String _serialNumber) {
        serialNumber = _serialNumber;
    }

    @Override
    String getSerialNumber() {
        System.out.println("일련번호를 얻어갔습니다.");
        return super.getSerialNumber();
    }

    @Override
    public int getPrice() {
        return 2000;
    }
}

class BentleyGT extends Car2 {
    BentleyGT(String _serialNumber) {
        serialNumber = _serialNumber;
    }

    @Override
    String getSerialNumber() {
        return serialNumber + "*" + birthDate;
    }

    @Override
    public int getPrice() {
        return 3000;
    }
}
