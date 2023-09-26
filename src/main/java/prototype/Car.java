package prototype;

public class Car implements Cloneable {
    private Brand brand;
    private String model;

    public Car(String model, Brand brand) {
        this.model = model;
        this.brand = brand;
    }

    public Brand getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Car newCar = (Car) super.clone();
        newCar.brand = (Brand) newCar.brand.clone();
        return newCar;
    }

    @Override
    public String toString() {
        return "Car { model: \'" + this.model + "\', " + this.brand + " }";
    }
}
