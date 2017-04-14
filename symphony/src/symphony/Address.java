/*
File name: Address.java
Author: Rebecca Dawdy. Student # 040390031
Course: CST8132 – OOP
Project #1
Date: April 10, 2017
Professor: Leanne Seaward & Reg Dyer
Purpose: This class is used to create an address object for each person.
*/

package symphony;

/**
 * @author Rebecca Dawdy
 * @version 1.0
 * @since JavaSE-1.8
 *
 */
public class Address {

	/**
	 * The purpose of this variable is to represent the unit number of each
	 * address
	 */
	private int unitNumber;
	/**
	 * This variable represents the Street name of each address
	 */
	private String streetName;
	/**
	 * This variable represents the City name of each address
	 */
	private String cityName;
	/**
	 * This variable represents the province of each address
	 */
	private String province;
	/**
	 * This variable represents the country of each address
	 */
	private String country;
	/**
	 * This variable represents the PostalCode class in the address class
	 */
	private PostalCode postalCode;

	/**
	 * @param unitNumber
	 *            represents the unit number of the address
	 * @param streetName
	 *            represents the Street Name of the address
	 * @param cityName
	 *            represents the City name of the address
	 * @param province
	 *            represents the province of the address
	 * @param postalCode
	 *            represents the postal code of the address
	 * @param country
	 *            represents the country of the address
	 */
	public Address(int unitNumber, String streetName, String cityName, String province, PostalCode postalCode,
			String country) {
		setUnitNumber(unitNumber);
		setStreetName(streetName);
		setCityName(cityName);
		setProvince(province);
		setPostalCode(postalCode);
		setCountry(country);

	}

	/**
	 * @return returns an integer which represents the unit number of the house
	 */
	public int getUnitNumber() {

		return this.unitNumber;

	}

	/**
	 * @param unitNumber
	 *            represents an addresses unit number
	 */
	public void setUnitNumber(int unitNumber) {

		this.unitNumber = unitNumber;

	}

	/**
	 * @return returns a string that represents a Street Name
	 */
	public String getStreetName() {

		return this.streetName;

	}

	/**
	 * @param streetName
	 *            represents an addresses street name
	 */
	public void setStreetName(String streetName) {

		this.streetName = streetName;
	}

	/**
	 * @return returns a string that represents a city name
	 */
	public String getCityName() {

		return this.cityName;

	}

	/**
	 * @param cityName
	 *            represents an addresses City
	 */
	public void setCityName(String cityName) {

		this.cityName = cityName;
	}

	/**
	 * @return returns a string that represents a Province
	 */
	public String getProvince() {

		return this.province;

	}

	/**
	 * @param province
	 *            represents an addresses Province
	 */
	public void setProvince(String province) {

		this.province = province;

	}

	/**
	 * @return returns a string representing a Country
	 */
	public String getCountry() {

		return this.country;

	}

	/**
	 * @param country
	 *            represents an addresses Country
	 */
	public void setCountry(String country) {

		this.country = country;
	}

	/**
	 * @return returns a Postal Code object that represents a Postal Code
	 */
	public PostalCode getPostalCode() {

		return postalCode;

	}

	/**
	 * @param postalCode
	 *            represents an addresses Postal Code
	 */
	public void setPostalCode(PostalCode postalCode) {

		this.postalCode = postalCode;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {

		return unitNumber + " " + streetName + ", " + cityName + ", " + province + ", " + postalCode + ", " + country;
	}
}
