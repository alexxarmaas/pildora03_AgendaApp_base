package org.ulpgc.is1.model;

public abstract class Contact {

    public String telephone;
    public String email;

    public Contact(String telephone, String email) {
        this.telephone = telephone;
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}