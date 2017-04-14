/*
File name: PhoneNumber.java
Author: Rebecca Dawdy. Student # 040390031
Course: CST8132 – OOP
Project #1
Date: April 10, 2017
Professor: Leanne Seaward & Reg Dyer
Purpose: This class is used to create an PhoneNumber object.
*/


package symphony;

/**
 * @author Rebecca Dawdy
 * @version 1.0
 * @since JavaSE-1.8
 *
 */
public class PhoneNumber {

    /**
     * This variable represents the area code portion of the phone number
     */
    private String areaCode;
    /**
     * This variable represents the first portion of a telephone number
     */
    private String firstLocalNumber;
    /**
     * This variable represents the second portion of a telephone number
     */
    private String secondLocalNumber;

    /**
     * @param areaCode String that represents the areaCode
     * @param firstLocalNumber String that represents the first 3 digit section of a phone number
     * @param secondLocalNumber String that represents the last 4 digit section of a phone number
     */ 
    public PhoneNumber(String areaCode, String firstLocalNumber, String secondLocalNumber ){

    	setAreaNumber(areaCode);
    	setFirstLocalNumber(firstLocalNumber);
    	setSecondLocalNumber(secondLocalNumber);
    	
    }

    /**
     * @return  Returns a string that contains the area code
     */
    public  String getAreaNumber(){

    	return this.areaCode;
    }

    /**
     * @param areaNumber  represents the area code of the phone number
     */
    public void setAreaNumber(String areaCode){
    	
    	this.areaCode = areaCode;

    }

    /**
     * @return String that holds the value of the first three digits of a phone number after the area code
     */
    public String getFirstLocalNumber(){
    	
    	return this.firstLocalNumber;

    }

    /**
     * @param firstLocalNumber represents the first three digits after the area code of a phone number
     */
    public void setFirstLocalNumber(String firstLocalNumber){

    	this.firstLocalNumber = firstLocalNumber;
    	
    }

    /**
     * @return String that represents the last 4 digits of a phone number
     */
    public String getSecondLocalNumber(){
    	
    	return this.secondLocalNumber;

    }

    /**
     * @param secondLocalNumber represents that last 4 digits of a phone number
     */
    public void setSecondLocalNumber(String secondLocalNumber){

    	this.secondLocalNumber = secondLocalNumber;
    	
    }
    
   /* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
public String toString(){
	   
	   return "(" + areaCode + ")-" + firstLocalNumber + "-" + secondLocalNumber;
   }
}
