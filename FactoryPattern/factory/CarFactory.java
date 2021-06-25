package FactoryPattern.factory;

import FactoryPattern.model.Car;
import FactoryPattern.model.Audi;
import FactoryPattern.model.BMW;
import FactoryPattern.model.Maruti;

public class CarFactory {
    public static Car getCar(String carType, int maxSpeed, int mileage, int price){
        if(carType.equalsIgnoreCase("Audi")){
            return new Audi(maxSpeed, mileage, price);
        }else if(carType.equalsIgnoreCase("BMW")){
            return new BMW(maxSpeed, mileage, price);
        }else if(carType.equalsIgnoreCase("Maruti")){
            return new Maruti(maxSpeed, mileage, price);
        }
        return null;
    }
}
