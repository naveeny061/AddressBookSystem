package com.javapractice;

import java.util.ArrayList;

public class AddressMethods {
	ArrayList<Address> addressBook = new ArrayList<Address>();

	void Add() {
		 Address address = new Address();
		 addressBook.add(address);
	}
}
