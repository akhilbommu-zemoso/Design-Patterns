package FactoryPattern.model;

public abstract class Car {
    public abstract int getMaxSpeed();
    public abstract int getMileage();
    public abstract int getPrice();

    @Override
    public String toString() {
        return "Price = " + this.getPrice() + " Mileage = " + this.getMileage() + "Km/L Max. Speed = " + this.getMaxSpeed() + " Km/hr";
    }
}
