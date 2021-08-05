package PrototypePattern;

public class CarPrototype implements Cloneable{
    String model;
    String variant;
    String features;
    int mileage;

    public CarPrototype(String model, String variant, String features, int mileage) {
        this.model = model;
        this.variant = variant;
        this.features = features;
        this.mileage = mileage;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }

    public void setFeatures(String features) {
        this.features += features;
    }

    public void setMileage(int mileage){
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "CarPrototype{" +
                "model='" + model + '\'' +
                ", variant='" + variant + '\'' +
                ", features='" + features + '\'' +
                ", mileage=" + mileage +
                '}';
    }

    @Override
    protected CarPrototype clone() throws CloneNotSupportedException{
        return (CarPrototype) super.clone();
    }
}
