package com.AddressBookCollection;

import java.util.*;

public class AddressBookManager {
        Scanner sc = new Scanner(System.in);
        /**
         * Added AddressBookManager class to add an ArrayList code in it.
         * Here I modified the access of the bookList to protected.
         * Because protected objects can be accessed in inner classes.
         */
        Map<String, List> storeAddressBooks = new HashMap<>();
        List<AddressBookBluePrint> bookList = new ArrayList<>();
        AddressBookBluePrint person;

        //add an ArrayList
        public void addPersonAddress(AddressBookBluePrint personAddress) {
            bookList.add(personAddress);
        }

        //Entering person details via AddressBookBluePrint
        public void callAddressBookBluePrint() {
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

        //searching person using first name
        AddressBookBluePrint searchPerson(String name) {
            Iterator iterator = bookList.iterator();
            for (AddressBookBluePrint names : bookList) {
                if (iterator.hasNext()) {
                    AddressBookBluePrint obj = (AddressBookBluePrint) iterator.next();
                    if (obj.getFirstName().equalsIgnoreCase(name)) {
                        return obj;
                    }
                }

            }
            return null;
        }

        //update person details via searching person with first name
        public void updatePersondetails() {
            System.out.println("Enter person Name : ");
            String name = sc.next();
            AddressBookBluePrint tempObj = searchPerson(name);
            System.out.println(tempObj);

            System.out.println("1. update firstname");
            System.out.println("2. update Lastname");
            System.out.println("3. update address");
            System.out.println("4. update city");
            System.out.println("5. update state");
            System.out.println("6. update email");
            System.out.println("7. update zip");
            System.out.println("8. update phone number");
            int opt = sc.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("Enter new first name : ");
                    String fName = sc.next();
                    tempObj.setFirstName(fName);
                    break;
                case 2:
                    System.out.println("Enter new last name : ");
                    String lName = sc.next();
                    tempObj.setLastName(lName);
                    break;
                case 3:
                    System.out.println("Enter new address : ");
                    String address = sc.next();
                    tempObj.setAddress(address);
                    break;
                case 4:
                    System.out.println("Enter new city : ");
                    String city = sc.next();
                    tempObj.setCity(city);
                    break;
                case 5:
                    System.out.println("Enter new State : ");
                    String state = sc.next();
                    tempObj.setState(state);
                    break;
                case 6:
                    System.out.println("Enter new Email : ");
                    String email = sc.next();
                    tempObj.seteMail(email);
                    break;
                case 7:
                    System.out.println("Enter new ZipCode : ");
                    int zip = sc.nextInt();
                    tempObj.setZip(zip);
                    break;
                case 8:
                    System.out.println("Enter new phone number : ");
                    int phonnum = sc.nextInt();
                    tempObj.setMobileNum(phonnum);
                    break;
            }
            System.out.printf("Updated Person details = " + tempObj);
        }

        //remove person with help of his name
        public void removePersonDetails() {
            System.out.printf("Enter Name to Delete person in Records : ");
            String name = sc.next();
            AddressBookBluePrint person = searchPerson(name);
            bookList.remove(person);
            System.out.println("Deleted person = " + person);

        }

        //print hole array list book
        public void printBook(){
            for (AddressBookBluePrint perObj: bookList){
                System.out.println(perObj);
            }
        }

    //method to store multiple address books
    public void storeCurrentAddressBook() {
        System.out.println("Enter name for address book: ");
        String addressBookName = sc.next();
        storeAddressBooks.put(addressBookName, bookList);
    }

    //method to print all address books from system
    public void printAddressBooks() {
        System.out.println(storeAddressBooks);
        System.out.println("Address book is stored");
    }

    @Override
    public String toString() {
        return "AddressBookManager [storeAddressBooks=" + storeAddressBooks + ", addressBookList=" + bookList
                + ", sc=" + sc + "]";
    }

    //method to create new address book
    public void creatNewAddressBooks() {
        bookList.clear();
        System.out.println("New Address book is created");
    }

}
