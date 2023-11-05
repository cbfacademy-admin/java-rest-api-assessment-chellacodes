package com.cbfacademy.apiassessment;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName(value = "The Self Assessment Methods should ")
public class SelfAssessmentUserDetailsTest {

SelfAssessmentUserDetails userDetails = new SelfAssessmentUserDetails("CJ01234" , "Jane" , "Doe", 2000, "07590673402", false , false , true , true , true);   


// Below I am testing the get() method for returning the values; firstName, lastName, yearOfBirth, answer1, answer2, answer3 , answer 4 , answer 5. 


    @Test
    @DisplayName("return userID when get userID is used")
        public void testGetUserID() {
            String userID = userDetails.getUserID();
            assertEquals("CJ01234", userID);
        }

    @Test
    @DisplayName("returns firstName when get firstName is used")
        public void testGetFirstName() {
            String firstName = userDetails.getFirstName();
            assertEquals("Jane", firstName);
        }
    

    @Test
    @DisplayName("return lastName when getLastName is used")
        public void testGetLastName() {

            String lastName = userDetails.getLastName();
            assertEquals("Doe", lastName);
        }

    @Test
    @DisplayName("return yearOfBirth when getYearOfBirth is used")
        public void testYearOfBirth() {

            int yearOfBirth = userDetails.getYearOfBirth();
            assertEquals(2000 , yearOfBirth);
        }


    @Test
    @DisplayName("return contactNumber when getContactNumber is used")
        public void testGetContactNumber() {

            String contactNumber = userDetails.getContactNumber();
            assertEquals("07590673402", contactNumber);
        }


    @Test
    @DisplayName("return answer1 when getAnswer1 is used")
        public void testGetAnswer1() {

            boolean answer1 = userDetails.getAnswer1();
            assertEquals(false, answer1);
        }

    @Test
    @DisplayName("return answer2 when getAnswer1 is used")
        public void testGetAnswer2() {

            boolean answer2 = userDetails.getAnswer2();
            assertEquals(false, answer2);
        }

    @Test
    @DisplayName("return answer3 when getAnswer1 is used")
        public void testGetAnswer3() {

            boolean answer3 = userDetails.getAnswer3();
            assertEquals(true, answer3);
        }

    @Test
    @DisplayName("return answer3 when getAnswer1 is used")
        public void testGetAnswer4() {

            boolean answer4 = userDetails.getAnswer4();
            assertEquals(true, answer4);
        }

    @Test
    @DisplayName("return answer3 when getAnswer1 is used")
        public void testGetAnswer5() {

            boolean answer5 = userDetails.getAnswer3();
            assertEquals(true, answer5);
        }


// below i am running tests to test the set methods from the Self Assessment user details class 



    @Test
    @DisplayName("sets value of user name when setUserName is used")
        public void testSetUserName() {

            userDetails.setUserID("JD12345");
            String userID = userDetails.getUserID();
            assertEquals("JD12345", userID);
        }


    @Test
    @DisplayName("sets value of first name when setFirstName is used")
        public void testSetFirstName() {

            userDetails.setFirstName("Chella"); 

            String firstName = userDetails.getFirstName(); 
            assertEquals("Chella", firstName); 
        }


    @Test
    @DisplayName("sets value of last name when setLastName is used")
        public void testSetLastName() {
            
                userDetails.setLastName("Johnson"); 
                String lastName = userDetails.getLastName();
                assertEquals("Johnson", lastName);
        }

    @Test
    @DisplayName("sets value of year of birth when setYearOfBirth is used")
        public void testSetYearOfBirth() {

            userDetails.setYearOfBirth(1998); 
            int yearOfBirth = userDetails.getYearOfBirth();
            assertEquals(1998, yearOfBirth);
        }

    @Test
    @DisplayName("sets value of year of birth when setYearOfBirth is used")
        public void testSetContactNumber() {
            
            userDetails.setContactNumber("07490571681"); 
            String contactNumber = userDetails.getContactNumber();
            assertEquals("07490571681", contactNumber);
        }

    @Test 
    @DisplayName("set value of answer to question one when setAnswer1 is used")
        public void testSetAnswer1() {
            
            userDetails.setAnswer1(false); 
            boolean answer1 = userDetails.getAnswer1();
            assertEquals(false, answer1);
        }

    @Test 
    @DisplayName("set value of answer to question true when setAnswer1 is used")
        public void testSetAnswer2() {
            
            userDetails.setAnswer2(true); 
            boolean answer2 = userDetails.getAnswer2();
            assertEquals(true, answer2);
        }

    @Test 
    @DisplayName("set value of answer to question three when setAnswer1 is used")
        public void testSetAnswer3() {
            
            userDetails.setAnswer3(false); 
            boolean answer3 = userDetails.getAnswer3();
            assertEquals(false, answer3);
        }

    @Test 
    @DisplayName("set value of answer to question four when setAnswer1 is used")
        public void testSetAnswer4() {
            
            userDetails.setAnswer4(true); 
            boolean answer4 = userDetails.getAnswer4();
            assertEquals(true, answer4);
        }

    @Test 
    @DisplayName("set value of answer to question five when setAnswer1 is used")
        public void testSetAnswer5() {
            
            userDetails.setAnswer5(true); 
            boolean answer5 = userDetails.getAnswer5();
            assertEquals(true, answer5);

        }


// test that the toString method returns the user inputted recorded. 
    @Test
    @DisplayName("tests the toString method to return the values inputted when called")
        public void testToString() {
            String expected = "Self assessment details - {Jane , Doe , 2000 , 07590673402 , false , false , true , true , true }";
            String actual = userDetails.toString(); 

            assertEquals(expected, actual);
        }

}






