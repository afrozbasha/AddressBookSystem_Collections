package com.AddressBookCollection;

public class AddressBookMain {

    public static void main(String[] args) {
        AddressBookManager bookBuild = new AddressBookManager();
        bookBuild.makechoice();
        boolean con = true;
        while (con){
            boolean con1 = bookBuild.makechoice();
            if (con1 == false)
                break;
        }
    }
}
