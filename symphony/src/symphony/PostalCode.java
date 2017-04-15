/*
File name: PostalCode.java
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
public class PostalCode {

    /**
     * This variable represents the first 3 characters of a postal code which represent
     * which sortation facility a letter should be transferred to.  
     */
    private String forwardSortationAreas;
    /**
     * This variable represents the last 3 characters of a postal code which determine
     * which local delivery unit a letter should be transferred to.
     */
    private String localDeliveryUnit;

    /**
     * @param forwardSortationAreas represents the forward sortation area of the postal code
     * @param localDeliveryUnit  represents the local delivery unit of the postal code
     */
    public PostalCode(String forwardSortationAreas, String localDeliveryUnit){
    	
    	setForwardSortationAreas(forwardSortationAreas);
    	setLocalDeliveryUnit(localDeliveryUnit);

    }

    /**
     * @return returns a String which represents the forward Sortation Area of the Postal code
     */
    public String getForwardSortationAreas(){
    	
    	return this.forwardSortationAreas;

    }

    /**
     * @param forwardSortationAreas represents the forward sortation area
     */
    public void setForwardSortationAreas(String forwardSortationAreas){

    	this.forwardSortationAreas = forwardSortationAreas;
    }

    /**
     * @return returns a string which represents the local delivery unit
     */
    public String getLocalDeliveryUnit(){
    	
    	return this.localDeliveryUnit;

    }

    /**
     * @param localDeliveryUnit returns a string which represents the local delivery unit
     */
    public void setLocalDeliveryUnit(String localDeliveryUnit){

    	this.localDeliveryUnit = localDeliveryUnit;
    }
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString(){
    	return forwardSortationAreas + localDeliveryUnit;
    	
    }
}
