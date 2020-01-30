package com.company;

public class Vehicle {
    public String name = "";
    public String model = "";
    public String color = "";
    public String company = "";
    private String engine = "";
    public static int count = 0;

    public Vehicle() {
        count++;
    }

    public Vehicle(String name, String model, String color, String company) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.company = company;
        count++;
    }
    public String getName(){
       return this.name;
    }
    public String getModel(String model){
        return this.model;
    }
    public String getInfo(){
        return "this is a vehicle";
    }
    public static String getVehicle(){
        return "vehicle is cool and sexy";
    }
//    private String get
}

