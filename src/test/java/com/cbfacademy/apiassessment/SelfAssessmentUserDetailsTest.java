package com.cbfacademy.apiassessment;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName(value = "The Self Assessment Methods should ")
public class SelfAssessmentUserDetailsTest {

SelfAssessmentUserDetails userDetails = new SelfAssessmentUserDetails("Jane" , "Doe", 2000, "07590673402", false , false , true , true , true);   


// Below I am testing the get() method for returning the values; firstName, lastName, yearOfBirth, answer1, answer2, answer3 , answer 4 , answer 5. 

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

// how would I run a test if I want to 

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











}






