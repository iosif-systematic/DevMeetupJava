package creational.builder.example;


import utils.ObjectPrintUtil;

public class BuilderMain {
    public static void main(String[] args) {
        Person person = new Person.Builder()
                .setFirstName("Bob").setLastName("Marley").setMiddleName("Bobita")
                .build();
        ObjectPrintUtil.printObject(person);
    }
}












