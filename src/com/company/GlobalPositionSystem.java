package com.company;

public class GlobalPositionSystem extends Decorator{
    Auto auto;

    public GlobalPositionSystem (Auto auto){
        this.auto = auto;
    }

    @Override
    public int getPrice() {
        return auto.getPrice()+ 2500;
    }

    @Override
    public String getInfo() {
        return auto.getInfo()+ " + GPS";
    }
}
