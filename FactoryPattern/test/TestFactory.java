package FactoryPattern.test;

import FactoryPattern.factory.CarFactory;
import FactoryPattern.model.Car;

public class TestFactory {
    public static void main(String[] args){
        Car audi = CarFactory.getCar("audi",180,15,3000000);
        Car bmw = CarFactory.getCar("bmw",200,14,3500000);
        Car maruti = CarFactory.getCar("maruti",140,20,1200000);

        System.out.println("Audi Details : " + audi);
        System.out.println("BMW Details : " + bmw);
        System.out.println("Maruti Details : " + maruti);
    }
}
