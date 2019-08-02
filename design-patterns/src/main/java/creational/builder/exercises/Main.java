package creational.builder.exercises;

import utils.ObjectPrintUtil;

public class Main {
    public static void main(String[] args) {
        Car porche = new Car("Porche", 200000, "EUR", 380, "km/h", "Green", 5, 2019, true, true, false);

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
