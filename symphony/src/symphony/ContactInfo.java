/*
File name: ContactInfo.java
Author: Rebecca Dawdy. Student # 040390031
Course: CST8132 – OOP
Project #1
Date: April 10, 2017
Professor: Leanne Seaward & Reg Dyer
Purpose: This class is used to create an ContactInfo object for each person.
*/

package symphony;

/**
 * @author Rebecca Dawdy
 * @version 1.0
 * @since JavaSE-1.8
 *
 */
public class ContactInfo {

	/**
	 * This variable represents the PhoneNumber class
	 */
	private PhoneNumber phoneNumber;
	/**
	 * This variable represents the Address class
	 */
	private Address address;

	/**
	 * @param phoneNumber
	 *            represents the phone number of the Contact
	 * @param address
	 *            represents the address of the Contact
	 */
	public ContactInfo(PhoneNumber phoneNumber, Address address) {

		setPhoneNumber(phoneNumber);
		setAddress(address);

	}

	/**
	 * @return returns a phoneNumber object that represents that contacts phone number
	 */
	public PhoneNumber getPhoneNumber() {

		return this.phoneNumber;

	}

	/**
	 * @param phoneNumber represents the contacts phone number
	 */
	public void setPhoneNumber(PhoneNumber phoneNumber) {

		this.phoneNumber = phoneNumber;

	}

	/**
	 * @return returns an address object with represents the contacts address
	 */
	public Address getAddress() {

		return address;
	}

	/**
	 * @param address represents the contacts address
	 */
	public void setAddress(Address address) {

		this.address = address;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {

		return phoneNumber + ", " + address;
	}
}