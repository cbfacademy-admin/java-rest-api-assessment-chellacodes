package com.cbfacademy.apiassessment;

public class SelfAssessmentUserDetails {

    private int userID;
    private String firstName; 
    private String lastName;
    private int yearOfBirth;
    private String contactNumber; 
    private Boolean answer1; 
    private Boolean answer2; 
    private Boolean answer3;
    private Boolean answer4; 
    private Boolean answer5; 

    // default constructor 

    public SelfAssessmentUserDetails() {}


    public SelfAssessmentUserDetails(int userID, String firstName, String lastName, int yearOfBirth, String contactNumber, boolean answer1, boolean answer2, boolean answer3, boolean answer4, boolean answer5) {

        this.userID = userID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.contactNumber = contactNumber; 
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.answer5 = answer5; 

    }

    public int getUserID() {
        return userID;
    }
    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getFirstName() { 
        return contactNumber; 
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName; 
    }


    public String getLastName() { 
        return lastName; 
    }
    public void setLastName(String lastName) {
        this.lastName = lastName; 
    }


    public int getYearOfBirth() { 
        return yearOfBirth; 
    }
    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth; 
    }


    public String getContactNumber() {
        return getContactNumber(); 
    }
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }


    public boolean getAnswer1() {
        return getAnswer1();
    }
    public void setAnswer1(boolean answer1) {
        this.answer1 = answer1; 
    }

    
    public boolean getAnswer2() {
        return getAnswer2();
    }
    public void setAnswer2(boolean answer2) {
        this.answer2 = answer2; 
    }


    public boolean getAnswer3() {
        return getAnswer3();
    }
    public void setAnswer3(boolean answer3) {
        this.answer3 = answer3; 
    }


    public boolean getAnswer4() {
        return getAnswer4();
    }
    public void setAnswer4(boolean answer4) {
        this.answer4 = answer4; 
    }


    public boolean getAnswer5() {
        return getAnswer5();
    }
    public void setAnswer5(boolean answer5) {
        this.answer5 = answer5; 
    }

    @Override public String toString() {

        return "User Detail Records{" + "User ID=" + userID +
        ", First name=" + firstName + ", Last name=" + lastName
        + ", Year of Birth=" + yearOfBirth + ", Contact number=" + contactNumber + ", Answer to question 1=" + answer1 + ", Answer to question 2=" + 
        answer2 + ", Answer to question 3=" + answer3 + ", Answer to question 4 =" + answer4 + ", Answer to question 5 =" + 
        answer5 + "}"; 
    }
    }
    

