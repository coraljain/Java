package com.company;

public class Car extends Vehicle {
    public boolean hasSRSbags = true;
    public boolean hasTrunkSpace = false;

    public Car(String name, String model, String color, String company, boolean hasSRSbags, boolean hasTrunkSpace) {
        super(name, model, color, company);
        this.hasSRSbags = hasSRSbags;
            this.hasTrunkSpace = hasTrunkSpace;
    }
    public String getName(String name) {
        return "name of your vehicle is: " + super.getName();
    }
    public String getInfo(){
        return "this is a car";
    }
}
