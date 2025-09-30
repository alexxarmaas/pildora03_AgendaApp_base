package org.ulpgc.is1.model;

public class Person extends Contact {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName, String phone, String email,
                  String street, int number, int floor, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        setPhone(phone);
        setEmail(email);
        setAddress(street, number, floor, city);
    }

    @Override
    public String getName() {
        return firstName + " " + lastName;
    }
}
