package com.javapractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AddressMethods {
	ArrayList<Address> addressBook = new ArrayList<Address>();

	void Add() {
		Address address = new Address();
		addressBook.add(address);
	}

	void Show() {
		Iterator itr = addressBook.iterator();
		while (itr.hasNext()) {
			Address address = (Address) itr.next();
			System.out.println("Name- " + address.getFirst_Name() + " " + address.getLast_Name());
			System.out.println("Address- " + address.getAddress());
			System.out.println(
					"City- " + address.getCity() + "  State-  " + address.getState() + "  Zip-  " + address.getZip());
			System.out.println("Phone Number- " + address.getPhone_Number());
			System.out.println("Email- " + address.getEmail());
			System.out.println("--------------------------");
		}
	}

	void Edit() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name whose deatils need to change  ");
		String name = scanner.nextLine();
		System.out.println("Enter the detail you have to edit");
		while (true) {
			System.out.println("Press 1 : Address");
			System.out.println("Press 2 : City");
			System.out.println("Press 3 : State");
			System.out.println("Press 4 : Zip");
			System.out.println("Press 5 : Phone Number");
			System.out.println("Press 6 : Email");
			System.out.println("Press 0 : Exit");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the new Address ");
				String Addresss = scanner.next();
				for (int i = 0; i < addressBook.size(); i++) {
					if (addressBook.get(i).getFirst_Name().equalsIgnoreCase(name)) {
						Address address = addressBook.get(i);
						address.setAddress(Addresss);
					}
				}
				break;
			case 2:
				System.out.println("Enter the new City");
				String City = scanner.next();
				for (int i = 0; i < addressBook.size(); i++) {
					if (addressBook.get(i).getFirst_Name().equalsIgnoreCase(name)) {
						Address address = addressBook.get(i);
						address.setCity(City);
					}
				}
				break;
			case 3:
				System.out.println("Enter the new State");
				String State = scanner.next();
				for (int i = 0; i < addressBook.size(); i++) {
					if (addressBook.get(i).getFirst_Name().equalsIgnoreCase(name)) {
						Address address = addressBook.get(i);
						address.setState(State);
					}
				}
				break;
			case 4:
				System.out.println("Enter the new Zip");
				String Zip = scanner.next();
				for (int i = 0; i < addressBook.size(); i++) {
					if (addressBook.get(i).getFirst_Name().equalsIgnoreCase(name)) {
						Address address = addressBook.get(i);
						address.setZip(Zip);
					}
				}
				break;
			case 5:
				System.out.println("Enter the new Phone Number");
				String Phone_Number = scanner.next();
				for (int i = 0; i < addressBook.size(); i++) {
					if (addressBook.get(i).getFirst_Name().equalsIgnoreCase(name)) {
						Address address = addressBook.get(i);
						address.setPhone_Number(Phone_Number);
					}
				}
				break;
			case 6:
				System.out.println("Enter the new email ");
				String Email = scanner.next();
				for (int i = 0; i < addressBook.size(); i++) {
					if (addressBook.get(i).getFirst_Name().equalsIgnoreCase(name)) {
						Address address = addressBook.get(i);
						address.setEmail(Email);
						;
					}
				}
				break;
			case 0:
				return;
			default:
				System.out.println("Please Enter Correct Option");
			}
		}
	}

	void Delete() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Name whose data to delete");
		String name = scanner.next();
		for (int i = 0; i < addressBook.size(); i++) {
			if (addressBook.get(i).getFirst_Name().equalsIgnoreCase(name)) {
				addressBook.remove(i);
			}
		}
	}

}
