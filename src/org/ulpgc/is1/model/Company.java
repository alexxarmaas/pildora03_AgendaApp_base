package org.ulpgc.is1.model;

public class Company extends Contact {
    private String name;

    public Company(String name, String phone, String email,
                   String street, int number, int floor, String city) {
        this.name = name;
        setPhone(phone);
        setEmail(email);
        setAddress(street, number, floor, city);
    }

    @Override
    public String getName() {
        return name;
    }
}
