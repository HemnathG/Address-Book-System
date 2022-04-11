package com.bridgelabz;

public class AddressBook {

    public static void main(String[] args) {

        System.out.println("Welcome to the Address Book System");

        AddressBookContacts contact = new AddressBookContacts("Hemanth", "G", "Katpadi", "Vellore", "Tamilnadu",
                "hemnath@gmail.com", 123456, 789456123);

        System.out.println("Contact is created for : " + contact.firstName + " " + contact.lastName);

    }
}
