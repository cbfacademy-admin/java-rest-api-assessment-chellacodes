package com.cbfacademy.apiassessment;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;

// class containing getters and setters for to take input of values 

public class SelfAssessmentUserDetails {

    private String userID;
    private String name;
    private int yearOfBirth;
    private String contactNumber; 
    private Boolean answer1; 
    private Boolean answer2; 
    private Boolean answer3;
    private Boolean answer4; 
    private Boolean answer5; 

    // default constructor 
    // non of my internal values are being processed 
    // need to set default values 

    public SelfAssessmentUserDetails() {}


    public SelfAssessmentUserDetails(String userID, String name, int yearOfBirth, String contactNumber, boolean answer1, boolean answer2, boolean answer3, boolean answer4, boolean answer5) {
// this.userID = userID set as UUID ?  this.uuid = uuid.randomid  this.userID = UUID.randomUUID();
// randomUUID method. change 

        this.userID = userID; 
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.contactNumber = contactNumber; 
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.answer5 = answer5;

    }


        public String getUserID() {
            return userID; 
        }

        // wouldnt want to have a setter as you wouldnt want it to be changed. 
        // public void setUserID(String userID) {
        // this.userID = userID;
        

    // get method 
        public String getName() {
            return name;
        }
    // set method to allow value of string to be passed as firstName
    // contructor for method to allow string to be inputted as value
        public void setName(String name) {
        this.name = name; 
        }

        public int getYearOfBirth() { 
        return yearOfBirth; 
        }
        public void setYearOfBirth(int yearOfBirth) {
            this.yearOfBirth = yearOfBirth;   
        }


        public String getContactNumber() {
            return contactNumber; 
        }
        public void setContactNumber(String contactNumber) {
            this.contactNumber = contactNumber;
        }

        // change these to post questions 

        // @GetMapping so the user can see the questions "get the questions"

        public boolean getAnswer1() {
            return answer1;
        }

        public void setAnswer1(boolean answer1) {
            this.answer1 = answer1; 
        }


        public boolean getAnswer2() {
        return answer2;
        }
        public void setAnswer2(boolean answer2) {
            this.answer2 = answer2;
        }


        public boolean getAnswer3() {
        return answer3;
        }
        public void setAnswer3(boolean answer3) {
            this.answer3 = answer3;
        }


        public boolean getAnswer4() {
        return answer4;
        }
        public void setAnswer4(boolean answer4) {
            this.answer4 = answer4;
        }


        public boolean getAnswer5() {
        return answer5;
        }
        public void setAnswer5(boolean answer5) {
            this.answer5 = answer5; 
        }


        @JsonIgnore
        public Map<String, Boolean> getAnswers() {
            Map<String, Boolean> answers = new HashMap<>(); 
            answers.put("answer1", this.answer1);
            answers.put("answer2", this.answer2);
            answers.put("answer3", this.answer3);
            answers.put("answer4", this.answer4);
            answers.put("answer5", this.answer5);
            
            return answers;
        }


        // toString merthod to return list of values inputted when called 
        @Override public String toString() {

            return "Self assessment details - { " + userID + " , " + name + " , " + yearOfBirth + " , " + contactNumber + " , " + answer1 + " , " + answer2 + " , " + answer3 + " , " + answer4 + " , " + answer5 + " }"; 
        }

































}

    
