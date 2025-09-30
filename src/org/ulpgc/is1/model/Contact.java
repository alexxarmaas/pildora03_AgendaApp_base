package org.ulpgc.is1.model;

public abstract class Contact {
    protected String phone;
    protected String email;
    protected Address address;

    public abstract String getName();

    public String getPhone() {
        return phone;
    }
    public String getEmail() {
        return email;
    }
    public void setAddress(String street, int number, int floor, String city) {
        this.address = new Address(street, number, floor, city);
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address.toString() +
                '}';
    }
}
