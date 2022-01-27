package com.company;

public class Main {
    public static void main(String[] args) {
        CarBasics car = new CarBasics();
        car.color = "red";
        car.engine = "79yy99cc";
        car.door ="2";
        car.number= "119nn018";

        System.out.println(car.color);

        car.color ="green";
        car.number ="789";
        car.engine = "454cc";
        car.door = "63";

        System.out.println(car.color);
    }
}
