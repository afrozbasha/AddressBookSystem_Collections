package com.AddressBookCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookManager {
    /**
     * Added AddressBookManager class to add an ArrayList code in it.
     * Here I modified the access of the bookList to protected.
     * Because protected objects can be accessed in inner classes.
     */
    List<AddressBookBluePrint> bookList = new ArrayList<>();
    AddressBookBluePrint person;

    //add an ArrayList
    public void addPersonAddress(AddressBookBluePrint personAddress){
        bookList.add(personAddress);
    }

    //Entering person details via AddressBookBluePrint
    public void callAddressBookBluePrint(){
        Scanner sc = new Scanner(System.in);

        //Entering person details via AddressBookBluePrint
        System.out.print("Enter firstName: ");
        String firstName = sc.next();
        System.out.print("Enter lastName: ");
        String lastName = sc.next();
        System.out.print("Enter address: ");
        String address = sc.next();
        System.out.print("Enter city: ");
        String city = sc.next();
        System.out.print("Enter state: ");
        String state = sc.next();
        System.out.print("Enter email: ");
        String email = sc.next();
        System.out.print("Enter zip: ");
        int zip = sc.nextInt();
        System.out.print("Enter mobileNumber: ");
        long mobileNumber = sc.nextLong();


        //passing variables via constructor details in AddressBookBluePrint
        person = new AddressBookBluePrint(firstName,
                lastName,
                address,
                city,
                state,
                email,
                zip,
                mobileNumber);
        System.out.printf(person.toString());

        //add an ArrayList
        addPersonAddress(person);

    }

    public static void main(String[] args) {
        AddressBookManager add = new AddressBookManager();
        add.callAddressBookBluePrint();
    }
}
