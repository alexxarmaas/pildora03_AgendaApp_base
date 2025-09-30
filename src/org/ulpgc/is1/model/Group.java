package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private List<Contact> contactList;

    public Group(String name) {
        this.name = name;
        contactList = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contactList.add(contact);
    }

    public void removeContact(int index) {
        contactList.remove(contactList.get(index));
    }


    public int contactCount() {
        return contactList.size();
    }

    public String getName() {
        return name;
    }
}
