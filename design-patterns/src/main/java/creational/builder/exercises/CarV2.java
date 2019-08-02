package creational.builder.exercises;

public class CarV2 {
    private String name;
    private long price;
    private String currency;
    private int speed;
    private String speedUnit;
    private String color="White";
    private int numberOfDoors = 4;
    private int buildYear;
    private boolean automaticTransmission;
    private boolean stillWorking;
    private boolean electric;

    public String getName() {
        return name;
    }

    public CarV2 setName(String name) {
        this.name = name;
        return this;
    }

    public long isPrice() {
        return price;
    }

    public CarV2 setPrice(long price) {
        this.price = price;
        return this;
    }

    public int getSpeed() {
        return speed;
    }

    public CarV2 setSpeed(int speed) {
        this.speed = speed;
        return this;
    }

    public String getSpeedUnit() {
        return speedUnit;
    }

    public CarV2 setSpeedUnit(String speedUnit) {
        this.speedUnit = speedUnit;
        return this;
    }

    public String getColor() {
        return color;
    }

    public CarV2 setColor(String color) {
        this.color = color;
        return this;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public CarV2 setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        return this;
    }

    public int getBuildYear() {
        return buildYear;
    }

    public CarV2 setBuildYear(int buildYear) {
        this.buildYear = buildYear;
        return this;
    }

    public boolean isAutomaticTransmission() {
        return automaticTransmission;
    }

    public CarV2 setAutomaticTransmission(boolean automaticTransmission) {
        this.automaticTransmission = automaticTransmission;
        return this;
    }

    public boolean isStillWorking() {
        return stillWorking;
    }

    public CarV2 setStillWorking(boolean stillWorking) {
        this.stillWorking = stillWorking;
        return this;
    }

    public boolean isElectric() {
        return electric;
    }

    public CarV2 setElectric(boolean electric) {
        this.electric = electric;
        return this;
    }

    public String getCurrency() {
        return currency;
    }

    public CarV2 setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
}

