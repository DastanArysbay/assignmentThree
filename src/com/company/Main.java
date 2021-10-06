package com.company;

public class Main {

    public static void main(String[] args) {
        Auto autoOne = new TeslaModelX();
        System.out.println(autoOne.getInfo());
        System.out.println(autoOne.getPrice());

        autoOne = new GlobalPositionSystem(autoOne);
        System.out.println(autoOne.getInfo());
        System.out.println(autoOne.getPrice());

        autoOne = new AirCondition(autoOne);
        System.out.println(autoOne.getInfo());
        System.out.println(autoOne.getPrice());

        Auto autoTwo = new AirCondition(new GlobalPositionSystem(new TeslaModelS()));
        System.out.println(autoTwo.getInfo());
        System.out.println(autoTwo.getPrice());

        // write your code here
    }
}
