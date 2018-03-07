package com.ktkim.s03;

public interface TaxImposable
{
    public static final int CODE_APT = 1;
    public static final int CODE_CAR = 2;

    public abstract int getTaxCode();
    public abstract int getPrice();
}
