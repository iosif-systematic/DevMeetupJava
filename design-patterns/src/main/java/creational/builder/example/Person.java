package creational.builder.example;

public class Person {
    private String firstName;
    private String middleName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static class Builder {
        private String firstName;
        private String middleName;
        private String lastName;

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
            Person person = new Person();
            person.setFirstName(firstName);
            person.setLastName(lastName);
            person.setMiddleName(middleName);
            return person;
        }
    }
}