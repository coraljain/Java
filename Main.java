package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle();
        System.out.println(vehicle1.color);

        System.out.println(vehicle1.count);

        Vehicle vehicle2 = new Vehicle("suzuki","A","blue","maruti");
        System.out.println(vehicle2.company);
        System.out.println(vehicle2.model);
        System.out.println(vehicle2.color);
        System.out.println(vehicle2.name);
        System.out.println(vehicle2.count);
        System.out.println(Vehicle.getVehicle());;

//        System.out.println(vehicle1.getName("ggggsgdsg"));
        Car car1 = new Car("dzire", "Auto", "blue", "Maruti", true, true);
        System.out.println(car1.hasTrunkSpace);
        System.out.println(car1.getName());
        Vehicle vehicle3 = new Car("suzuki","A","blue","maruti", true, false);
        System.out.println(vehicle3.getInfo());










//            myStack mystack = new myStack();
//            if(!mystack.isFull()){
//                mystack.push(2);
//                mystack.push(4);
//                mystack.push(6);
//                mystack.push(9);
//
//            }
//            System.out.println(mystack.pop());
//            System.out.println(mystack.pop());
//            System.out.println(mystack.pop());
//            System.out.println(mystack.pop());

        }
        Vehicle vehicle1 = new Vehicle();
//        System.out.println(vehicle1.color);
//        System.out.println(vehicle1.count);
//
//        Vehicle vehicle2 = new Vehicle("suzuki","A","blue","maruti");
//        System.out.println(vehicle2.company);
//        System.out.println(vehicle2.model);
//        System.out.println(vehicle2.color);
//        System.out.println(vehicle2.name);
//        System.out.println(vehicle1.count);

//        System.out.println(vehicle1.getName("ggggsgdsg"));
//        Car car1 = new Car("dzire", "Auto", "blue", "Maruti", true, true);
//        System.out.println(car1.hasTrunkSpace);
//        System.out.println(car1.getName("civic"));
//        Vehicle vehicle2 = new Car("suzuki","A","blue","maruti", true, false);
//        System.out.println(vehicle2.getInfo());
//
//        }






    }

