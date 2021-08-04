package com.AddressBookCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class AddressBookMain {
    AddressBookManager mainObj = new AddressBookManager();
    public static void main(String[] args) {
        AddressBookMain obj = new AddressBookMain();

        //AddressBookManager add = new AddressBookManager();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Address Book System");


        boolean flag = true;
        do {
            System.out.println("\nEnter the Address Book Operation Option");

            System.out.println("1. Add new person in address Book");
            System.out.println("2. Update person in address Book");
            System.out.println("3. Remove person from address Book");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    obj.mainObj.callAddressBookBluePrint();
                    break;
                case 2:
                    obj.mainObj.updatePersondetails();
                    break;
                case 3:
                    obj.mainObj.removePersonDetails();
                    break;
                default:
                    flag = false;
            }
        }while(flag);



    }
}
