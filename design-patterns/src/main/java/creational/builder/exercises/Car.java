package creational.builder.exercises;

public class Car {
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

    public Car(String name, long price, String currency, int speed, String speedUnit, String color, int numberOfDoors, int buildYear, boolean automaticTransmission, boolean stillWorking, boolean electric) {
        this.name = name;
        this.price = price;
        this.currency = currency;
        this.speed = speed;
        this.speedUnit = speedUnit;
        this.color = color;
        this.numberOfDoors = numberOfDoors;
        this.buildYear = buildYear;
        this.automaticTransmission = automaticTransmission;
        this.stillWorking = stillWorking;
        this.electric = electric;
    }

    public String getName() {
        return name;
    }

    public long isPrice() {
        return price;
    }

    public int getSpeed() {
        return speed;
    }

    public String getSpeedUnit() {
        return speedUnit;
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int getBuildYear() {
        return buildYear;
    }

    public boolean isAutomaticTransmission() {
        return automaticTransmission;
    }

    public boolean isStillWorking() {
        return stillWorking;
    }

    public boolean isElectric() {
        return electric;
    }

    public String getCurrency() {
        return currency;
    }


}
