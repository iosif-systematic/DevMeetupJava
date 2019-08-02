package creational.builder.example;

public class Person {
    private String firstName;
    private String middleName;

    public Person(String firstName, String middleName, String lastName, int age, String fathersName, String mothersName, double height, double weight) {
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public static class Builder {
        private String firstName;
        private String middleName;
        private String lastName;
        private int age;
        private String fathersName;
        private String mothersName;
        private double height;
        private double weight;

        public Builder() {
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }


        public Person build() {
            return new Person(firstName, middleName, lastName, age, fathersName, mothersName, height, weight);
        }
    }
}