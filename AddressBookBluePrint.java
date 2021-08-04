package com.AddressBookCollection;

import java.util.Objects;

public class AddressBookBluePrint {
    //contact required variables
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String eMail;
    private int zip;
    private long mobileNum;


    //constructor variables passing from main
    public AddressBookBluePrint(String firstName, String lastName, String address, String city, String state, String eMail, int zip, long mobileNum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.eMail = eMail;
        this.zip = zip;
        this.mobileNum = mobileNum;
    }
    //default constructor
    public AddressBookBluePrint(){};

    //printing instance person details
    @Override
    public String toString() {
        return "AddressBookBluePrint{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", eMail='" + eMail + '\'' +
                ", zip=" + zip +
                ", mobileNum=" + mobileNum +
                '}';
    }

    //gets and sets for passing and calling variables
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public long getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(int mobileNum) {
        this.mobileNum = mobileNum;
    }


    @Override
    public int hashCode(){
        return Objects.hash(firstName, lastName, address, city, state, zip, mobileNum, eMail);
    }
    
}
