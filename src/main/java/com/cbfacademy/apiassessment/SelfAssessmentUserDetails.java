package com.cbfacademy.apiassessment;


// class containing getters and setters for to take input of values 

public class SelfAssessmentUserDetails {


    // default constructor 
    // non of my internal values are being processed 
    // need to set default values 

    public SelfAssessmentUserDetails() {}


    public SelfAssessmentUserDetails(Integer userID, String firstName, String lastName, Integer yearOfBirth, String contactNumber, boolean answer1, boolean answer2, boolean answer3, boolean answer4, boolean answer5) {
// this.userID = userID set as UUID ?  this.uuid = uuid.randomid  this.userID = UUID.randomUUID();
// randomUUID method. change 

        super();
        this.userID = userID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearofBirth = yearOfBirth;
        this.contactNumber = contactNumber; 
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.answer5 = answer5; 

    }

        private Integer userID;
        private String firstName; 
        private String lastName; 
        private Integer yearofBirth;
        private String contactNumber; 
        private Boolean answer1; 
        private Boolean answer2;
        private Boolean answer3; 
        private Boolean answer4; 
        private Boolean answer5; 

// toString merthod to return list of values inputted when called 
    @Override
    public String toString() {
        return "Self assessment details - { " + userID + firstName + " , " + lastName + " , " + yearofBirth + " , " + contactNumber + " , " + answer1 + " , " + answer2 + " , " + answer3 + " , " + answer4 + " , " + answer5 + " }"; 
    }

        public Integer getUserID() {
            return userID; 
        }

// wouldnt want to have a setter as you wouldnt want it to be changed. 
         public void setUserID(Integer userID) {
             this.userID = userID; 
         }
        

    // get method 
        public String getFirstName() {
            return firstName;
        }
    // set method to allow value of string to be passed as firstName
    // contructor for method to allow string to be inputted as value
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
        return yearofBirth; 
        }
        public void setYearOfBirth(int yearOfBirth) {
            this.yearofBirth = yearOfBirth;   
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


        

































}

    
