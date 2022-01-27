package com.company;

public class Main {
    public static void main(String[] args) {
        CarBasics car = new CarBasics();
        car.color = "red";
        car.engine = "7999cc";
        car.door ="2";
        car.number= "119018";

        System.out.println(car.color);

        car.color ="green";
        car.number ="789";
        car.engine = "4545454cc";
        car.door = "3";

        System.out.println(car.color);
    }
}
