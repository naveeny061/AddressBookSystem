package com.javapractice;

public class AddressBook {

	public static void main(String[] args) {
		 System.out.println("Welcome to Address Book Program");
		 AddressMethods addressMethod = new AddressMethods();
		 addressMethod.Add();
		 addressMethod.Edit();
		 addressMethod.Delete();
	}

}
