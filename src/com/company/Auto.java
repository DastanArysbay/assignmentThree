package com.company;

abstract class Auto {
    String name = "Unknown car";
    public String getInfo(){
        return name;
    }
    public abstract int getPrice();
}

