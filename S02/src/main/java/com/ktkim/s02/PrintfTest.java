package com.ktkim.s02;

public class PrintfTest
{
    public static void main(String[] args) {
        SinsaApt2 apt2001 = new SinsaApt2();
        apt2001.floorCount = 20;
        apt2001.parkingLotCount1 = 15;
        apt2001.parkingLotCount2 = 20;
        apt2001.elevatorCount = 1;

        System.out.println("2001동의 총 주차대수: " + apt2001.getTotalParkingCount());

        System.out.printf("2001동의 주차대수 현황: 주차장1 = %d, 주차장2 = %d", apt2001.parkingLotCount1,apt2001.parkingLotCount2);
    }
}
