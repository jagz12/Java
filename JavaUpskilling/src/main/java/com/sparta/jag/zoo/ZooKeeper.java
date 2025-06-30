package com.sparta.jag.zoo;

import java.time.LocalDate;

public class ZooKeeper extends Staff{


    public ZooKeeper(LocalDate dateOfEmployment, Integer shiftTimes, String name, String assignedEnclosure) {
        super(dateOfEmployment, shiftTimes, name, assignedEnclosure);
    }

    public String feedAnimals(){
        return getName() + " is feeding the Lion!";
    }

    @Override
    public String speak() {
        return super.speak()+" Meat";
    }
}
