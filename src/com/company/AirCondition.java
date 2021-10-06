package com.company;

 class AirCondition extends Decorator {
     Auto auto;

     public AirCondition(Auto auto) {
         this.auto= auto;
     }

     @Override
     public int getPrice() {
         return auto.getPrice()+ 3000;
     }

     @Override
     public String getInfo() {
         return auto.getInfo() + " + Air Conditioning";
     }
 }
