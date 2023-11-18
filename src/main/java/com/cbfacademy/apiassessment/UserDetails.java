package com.cbfacademy.apiassessment;

import java.util.Map;

public class UserDetails {

    public UserDetails() {

    }

    private String userID; 
    private String name; 
    private int yearOfBirth;
    private Map<String, Boolean> questions_answers; 

    public UserDetails(String userID, String name, int yearOfBirth, Map<String, Boolean> questions_answers) {
        this.userID = userID;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.questions_answers = questions_answers;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userId) {
        this.userID = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public Map<String, Boolean> getQuestions_answers() {
        return questions_answers;
    }

    public void setAnswers(Map<String, Boolean> questions_answers) {
        this.questions_answers = questions_answers;
    }



    }

    

