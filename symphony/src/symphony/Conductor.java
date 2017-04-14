/*
  File name: Conductor
  Author: Seokhwan Lee. Stuent # 040842046
  Course: CST8288-OOP
  Project #: Project1
  Date: 12th, April, 2017
  Professor: Leanne Seaward
  
  Purpose: 
 
 */
package symphony;

/** 
* @author Seokhwan Lee
* @version 1-1
* @since 1.8.0 
*/
public class Conductor {

    private ContactInfo contactInfo;
    private int id;
    public Conductor(PhoneNumber phoneNumber, Address address){
        setContactInfo(phoneNumber, address);
    }

    public int SelectComposition(Concert concert){

        return id;
    }    

    public void setContactInfo(PhoneNumber phoneNumber, Address address){
        contactInfo = new ContactInfo(phoneNumber, address);
    }
    public ContactInfo getContactInfo(){
        return this.contactInfo;
    }

    public String toString(){
        return contactInfo.toString();
    }

}