package com.ktkim.s02;

class SinsaApt3
{
    int floorCount;
    int parkingLotCount;
    int elevatorCount;

    SinsaApt3()
    {

    }

    SinsaApt3(int _floorCount)
    {
        floorCount = _floorCount;
        parkingLotCount = 30;

    }

    SinsaApt3(int _floorCount, int _parkingLotCount, int _elevatorCount)
    {
        floorCount = _floorCount;
        parkingLotCount = _parkingLotCount;
        elevatorCount = _elevatorCount;
    }
}

public class Constructor
{
    public static void main(String[] args) {
        SinsaApt3 apt3001 = new SinsaApt3();
        apt3001.floorCount = 20;
        apt3001.parkingLotCount = 30;
        apt3001.elevatorCount = 1;

        SinsaApt3 apt3002 = new SinsaApt3(25, 35, 1);

        System.out.println("3001동의 층수: " + apt3001.floorCount);
        System.out.println("3002동의 층수: " + apt3002.floorCount);
    }
}
