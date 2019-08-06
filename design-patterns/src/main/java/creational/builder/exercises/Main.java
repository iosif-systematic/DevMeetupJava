package creational.builder.exercises;

import creational.builder.exercises.workspace.CarBuilder;
import utils.ObjectPrintUtil;

public class Main {
    public static void main(String[] args) {
        Car porche = new CarBuilder().setName("Porche").setPrice(200000).setCurrency("EUR").setSpeed(380).setSpeedUnit("km/h").setColor("Green").setNumberOfDoors(5).setBuildYear(2019).setAutomaticTransmission(true).setStillWorking(true).setElectric(false).createCar();
        CarV2 oltcit = new CarV2()
                .setName("Oltcit")
                .setPrice(2)
                .setCurrency("Lei")
                .setSpeed(80)
                .setSpeedUnit("km/week")
                .setBuildYear(1980);

        ObjectPrintUtil.printObject(porche);
        ObjectPrintUtil.printObject(oltcit);

    }
}
