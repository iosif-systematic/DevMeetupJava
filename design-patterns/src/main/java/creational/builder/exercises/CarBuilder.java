package creational.builder.exercises;

public class CarBuilder {
    private String name;
    private long price;
    private String currency;
    private int speed;
    private String speedUnit;
    private String color;
    private int numberOfDoors;
    private int buildYear;
    private boolean automaticTransmission;
    private boolean stillWorking;
    private boolean electric;

    public CarBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public CarBuilder setPrice(long price) {
        this.price = price;
        return this;
    }

    public CarBuilder setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    public CarBuilder setSpeed(int speed) {
        this.speed = speed;
        return this;
    }

    public CarBuilder setSpeedUnit(String speedUnit) {
        this.speedUnit = speedUnit;
        return this;
    }

    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        return this;
    }

    public CarBuilder setBuildYear(int buildYear) {
        this.buildYear = buildYear;
        return this;
    }

    public CarBuilder setAutomaticTransmission(boolean automaticTransmission) {
        this.automaticTransmission = automaticTransmission;
        return this;
    }

    public CarBuilder setStillWorking(boolean stillWorking) {
        this.stillWorking = stillWorking;
        return this;
    }

    public CarBuilder setElectric(boolean electric) {
        this.electric = electric;
        return this;
    }

    public Car createCar() {
        return new Car(name, price, currency, speed, speedUnit, color, numberOfDoors, buildYear, automaticTransmission, stillWorking, electric);
    }
}