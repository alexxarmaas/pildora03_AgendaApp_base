package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    public List<Contact> contactList;
    public List<Group> groupList;

    public Agenda() {
        contactList = new ArrayList<>();
        groupList = new ArrayList<>();
    }

    public void addPerson(String firstName, String lastName, String phone, String email,
                          String street, int number, int floor, String city) {
        // Comprobar si ya existe contacto con mismo nombre o email
        for (Contact c : contactList) {
            if (c instanceof Person) {
                Person p = (Person) c;
                if (p.getName().equals(firstName + " " + lastName) || p.getEmail().equals(email)) {
                    System.out.println("Contacto duplicado detectado: " + p.getName());
                    return;  // No añadir duplicado
                }
            }
        }
        // No existe duplicado, añadir nuevo contacto
        contactList.add(new Person(firstName, lastName, phone, email, street, number, floor, city));
    }


    public void addCompany(String name, String phone, String email,
                           String street, int number, int floor, String city) {
        contactList.add(new Company(name, phone, email, street, number, floor, city));
    }

    public int contactCount() {
        return contactList.size();
    }

    public void addGroup(String name) {
        groupList.add(new Group(name));
    }

    public List<Group> getGroupList() {
        return groupList;
    }

    public List<Contact> getContactList() {
        return contactList;
    }


}
