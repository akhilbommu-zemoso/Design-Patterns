package FactoryPattern.model;

public class Audi extends Car{
    private int maxSpeed;
    private int mileage;
    private int price;

    public Audi(int maxSpeed, int mileage, int price){
        this.maxSpeed = maxSpeed;
        this.mileage = mileage;
        this.price = price;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getMileage() {
        return this.mileage;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
