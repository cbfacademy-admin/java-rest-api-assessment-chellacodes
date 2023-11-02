package com.cbfacademy.apiassessment;

public class SelfAssessmentUserDetails {

    public String firstName; 
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


    public SelfAssessmentUserDetails(String firstName, String lastName, int yearOfBirth, String contactNumber, boolean answer1, boolean answer2, boolean answer3, boolean answer4, boolean answer5) {

        
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

    public String getFirstName() {

        return firstName;
    }

     public String getLastName() { 
        return lastName; 
    }

    public int getYearOfBirth() { 
        return yearOfBirth; 
    }
    
    public String getContactNumber() {
        return contactNumber; 
    }


    public boolean getAnswer1() {
        return answer1;
    }

    public boolean getAnswer2() {
        return answer2;
    }

    public boolean getAnswer3() {
        return answer3;
    }

    public boolean getAnswer4() {
        return answer4;
    }

    public boolean getAnswer5() {
        return answer5;
    }


































}

    
