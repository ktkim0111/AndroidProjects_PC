package com.ktkim.s02;

class SinsaApt2
{
    int floorCount;
    int parkingLotCount1;
    int parkingLotCount2;
    int elevatorCount;

    int getTotalParkingCount()
    {
        return parkingLotCount1 + parkingLotCount2;
    }


}

public class OOP2
{
    public static void main(String[] args) {
        SinsaApt2 apt2001 = new SinsaApt2();
        apt2001.floorCount = 20;
        apt2001.parkingLotCount1 = 15;
        apt2001.parkingLotCount2 = 20;
        apt2001.elevatorCount = 1;

        SinsaApt2 apt2002 = new SinsaApt2();
        apt2002.floorCount = 25;
        apt2002.parkingLotCount1 = 20;
        apt2002.parkingLotCount2 = 25;
        apt2002.elevatorCount = 1;

        System.out.println("2001동의 총 주차대수: " + apt2001.getTotalParkingCount());
        System.out.println("2001동의 첫번째 주차대수: " + apt2001.parkingLotCount1);
        System.out.println("2001동의 두번째 주차대수: " + apt2001.parkingLotCount2);

        System.out.println("2001동의 주차대수 현황: 주차장1 = " + apt2001.parkingLotCount1 + ", 주차장2 = " + apt2001.parkingLotCount2);
    }
}
