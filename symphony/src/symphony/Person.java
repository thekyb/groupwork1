/*
  File name: Person
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
public class Person {
    private String firstName;
    private String lastName;
    private String gender;// TODO generate enum 
    private int age;

    public void Person(String firstName, String lastName, String gender, int age){
        setFirstName(firstName);
        setLastName(lastName);
        setGender(gender);
        setAge(age);
    }

    public String getFirstName(){
        return this.firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getGender(){
        return this.gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }
    
    public String toString(){
    return firstName + " " + lastName + ", " + gender + ", " + age;
    }

}