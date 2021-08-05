package PrototypePattern;

public class PrototypeDemo {
    public static void main(String[] args) throws CloneNotSupportedException{
        CarPrototype carObject1 = new CarPrototype("MG Hector","Petrol","Base Model", 18);
        System.out.println("Car1 : " + carObject1);

        CarPrototype carObject2 = carObject1.clone();
        carObject2.setVariant("Diesel");
        carObject2.setFeatures(" + Sun roof");
        carObject2.setMileage(20);
        System.out.println("Car2 : " + carObject2);
    }
}
