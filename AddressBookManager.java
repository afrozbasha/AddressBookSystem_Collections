package com.AddressBookCollection;
import java.util.*;

public class AddressBookManager implements MultipleAddressBook {
    public Map<String, ArrayList<AddressBookBluePrint>> book;
    public Map<String, ArrayList<AddressBookBluePrint>> multiBook;
    public Map<String, ArrayList<AddressBookBluePrint>> city;
    public Map<String, ArrayList<AddressBookBluePrint>> state;
    public ArrayList<AddressBookBluePrint> totalEntries;
    Scanner sc = new Scanner(System.in);

    //counting the count persons
    public int count = 0;

    // Constructor
    public AddressBookManager() {
        book = new HashMap<>();
        multiBook = new HashMap<>();
        city = new HashMap<>();
        state = new HashMap<>();
        totalEntries = new ArrayList<>();
    }

    @Override
    public void addAddressBook(String BookName, String FirstName, String LastName, String Address, String City, int Zip,
                               String State, long PhoneNumber, String Email) {
        AddressBookBluePrint adder = new AddressBookBluePrint(BookName, FirstName, LastName, Address, City, Zip, State, PhoneNumber, Email);
        totalEntries.add(adder);
        book.put(FirstName, totalEntries);
        multiBook.put(BookName, totalEntries);
        city.put(City, totalEntries);
        state.put(State, totalEntries);
        count++;
    }



    //This method takes console arguments
    public void callAddressBook() {
        System.out.println("Enter Address Book Name");
        String BookName = sc.next();
        System.out.println("Enter you first name");
        String FirstName = sc.next();
        System.out.println("Enter you last name");
        String LastName = sc.next();
        sc.nextLine();
        System.out.println("Enter you Address name");
        String Address = sc.nextLine();
        System.out.println("Enter you zip ");
        int Zip = sc.nextInt();
        System.out.println("Enter you city name");
        String City = sc.next();
        System.out.println("Enter you state name");
        String State = sc.next();
        sc.nextLine();
        System.out.println("Enter you phone number");
        long PhoneNumber = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter you email name");
        String Email = sc.nextLine();
        if (equals(FirstName))
            addAddressBook(BookName, FirstName, LastName, Address, City, Zip, State, PhoneNumber, Email);
        else
            System.out.println("The Name already exist in contacts please use different name");
    }

    public boolean equals(String firstName) {
        List<AddressBookBluePrint> details = book.get(firstName);
        if (details == null)
            return true;
        return false;
    }

    //This method helps to edit the details
    public void editContact() {
        System.out.println("enter your book name");
        String bookname = sc.next();
        ArrayList<AddressBookBluePrint> option = multiBook.get(bookname);
        System.out.println("enter your name");
        String name = sc.next();
        for (AddressBookBluePrint details : option) {
            if (details.getFirstName().equals(name)) {
                boolean conditon = true;
                while (conditon) {
                    System.out.println("enter number  1:first_name 2:last_name 3:address 4:City 5:zip 6:state 7:phone_number" +
                            " 8:email  0:quit");
                    int check = sc.nextInt();
                    switch (check) {
                        case 1:
                            System.out.println("Enter you first name");
                            String firstname = sc.next();
                            details.setFirstName(firstname);
                            System.out.println(book);
                            break;
                        case 2:
                            System.out.println("Enter you last name");
                            String lastname = sc.next();
                            details.setLastName(lastname);
                            System.out.println(book);
                            break;
                        case 3:
                            System.out.println("Enter you address ");
                            String addressname = sc.next();
                            details.setAddress(addressname);
                            System.out.println(book);
                            break;
                        case 4:
                            System.out.println("Enter you City name");
                            String cityname = sc.next();
                            details.setCity(cityname);
                            System.out.println(book);
                            break;
                        case 5:
                            System.out.println("Enter you Zip name");
                            int zipname = sc.nextInt();
                            details.setZip(zipname);
                            System.out.println(book);
                            break;
                        case 6:
                            System.out.println("Enter you State name");
                            String statename = sc.next();
                            details.setState(statename);
                            System.out.println(book);
                            break;
                        case 7:
                            System.out.println("Enter you Phone number");
                            long phonenumber = sc.nextLong();
                            sc.nextLine();
                            details.setMobileNum(phonenumber);
                            System.out.println(book);
                            break;
                        case 8:
                            System.out.println("Enter you email");
                            String emailname = sc.next();
                            details.seteMail(emailname);
                            System.out.println(book);
                            break;
                        case 0:
                            conditon = false;
                            break;
                        default:
                            System.out.println("invalid input");
                    }
                }
            }
        }
    }

    // This method helps to delete the contact details
    public void deleteEntry() {
        System.out.println("enter your name to delete from contact");
        String name = sc.next();
        book.remove(name);
    }

    public void viewPersonByCity() {
        System.out.println("Enter city");
        String location = sc.next();
        sc.nextLine();
        int flag = 1;
        for (String entry : city.keySet()) {
            if (entry.equals(location)) System.out.println(entry);
            flag = 0;
        }
        if (flag == 1) System.out.println("no records found");
    }

    public void viewPersonByState() {
        System.out.println("Enter state");
        String location = sc.next();
        sc.nextLine();
        int flag = 1;
        for (String entry : state.keySet()) {
            if (entry.equals(location)) System.out.println(entry);
            flag = 0;
        }
        if (flag == 1) System.out.println("no records found");
    }

    public void getContactByCityOrState() {
        System.out.println("Enter city or state");
        String location = sc.next();
        sc.nextLine();
        int flag = 1;
        for (String entry : multiBook.keySet()) {
            for (AddressBookBluePrint item : multiBook.get(entry)) {
                if (item.getState().equals(location) || item.getCity().equals(location)) {
                    System.out.println(item);
                    flag = 0;
                }
            }
        }
        if (flag == 1) System.out.println("no records found");
    }

    //counting the count persons
    private void getCountOfPersons() {
        System.out.println("total count is " + count);
    }


    // This method helps user to choose action
    public boolean makechoice() {
        System.out.println("enter 1:add contact 2:view by city 3:view by state 4:edit contact 5:delete contact" +
                " 6:person by city or state 7:get count of person or 0 to quit");
        int check = sc.nextInt();
        boolean conditon = true;
        switch (check) {
            case 1:
                callAddressBook();
                break;
            case 2:
                viewPersonByCity();
                break;
            case 3:
                viewPersonByState();
                break;
            case 4:
                editContact();
                break;
            case 5:
                deleteEntry();
                break;
            case 6:
                getContactByCityOrState();
                break;
            case 7:
                getCountOfPersons();
                break;
            case 0:
                conditon = false;
                break;
            default:
                System.out.println("invalid input");
        }
        return conditon;
    }
}
