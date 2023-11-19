package com.cbfacademy.apiassessment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


import java.util.LinkedList;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName(value = "The Self Assessment Programmes function class should:")

public class SelfAssessmentUserProgrammeFunctionsTest {

    private SelfAssessmentUserProgrammeFunctions functions;
    SelfAssessmentUserDetails userDetails = new SelfAssessmentUserDetails("TestUser", "Test User", 1990, "123456", true, false, true, false, true);
 
// with the @BeforeEach annotation line 13 will be initialised before each test 
    @BeforeEach

    public void setUp() {
        functions = new SelfAssessmentUserProgrammeFunctions(); 
    }

    @Test
    @DisplayName("Test the retrieveSelfAssessmentQuestions method does not return null value")
    public void testRetrieveSelfAssessmentQuestions() {
        LinkedList<Question> questions = functions.retrieveSelfAssessmentQuestions();
        assertNotNull(questions);
    }

    @Test
    @DisplayName("Test the retrieveSelfAssessment method does not return null value")
    public void testRetrieveSelfAssessment() {
        LinkedList<SelfAssessmentUserDetails> userDetails = functions.retrieveSelfAssessments();
        assertNotNull(userDetails);
    }

    @Test
    @DisplayName("Test the add method adds user details")
    public void testAdd() {
    // create an instance of the user detail class 
        functions.add(userDetails);
        LinkedList<SelfAssessmentUserDetails> userDetailsList = functions.retrieveSelfAssessments();
    // 
        assertTrue(userDetailsList.stream().anyMatch(user -> user.getUserID().equals("TestUser")));
    }

    @Test 
    @DisplayName("Test the find method correctly identifies the added user")
    public void testFind() {
        functions.add(userDetails);
        assertTrue(functions.find("TestUser"));
        assertFalse(functions.find("FakeUserID"));
    }

    @Test
    @DisplayName("Test the delete method correctly delete user based on usertID")
    public void testDeleteUserDetails() {
        functions.add(userDetails);
        boolean deleted = functions.deleteUserDetails("TestUser");
        assertTrue(deleted);
    }

    @Test
    @DisplayName("Test getUserDetails method returns list of selfAssesment input")
    public void testGetUserDetails() {
        // Arrange: Create a sample user
        functions.retrieveSelfAssessments().add(userDetails);

        // Act: Call the method
        SelfAssessmentUserDetails actualUser = functions.getUserDetails("TestUser");

        // Assert: Check if the returned user matches the expected user
        assertEquals(userDetails, actualUser);
    }

    @Test
    @DisplayName("Test getUserAnswers method returns list of users answers")
    public void testGetUserAnswers() {
        // Arrange: Create a sample user
        functions.retrieveSelfAssessments().add(userDetails);

        // Act: Call the method
        Map<String, Boolean> actualAnswers = functions.getUserAnswers("TestUser");

        // Assert: Check if the returned answers match the expected answers
        assertEquals(userDetails.getAnswers(), actualAnswers);
        }

    @Test
    @DisplayName("Test updateUserDetails method updates user if userID does not exist ")
    public void testUpdateUserDetails() { 
        SelfAssessmentUserDetails existingUser = new SelfAssessmentUserDetails("UserID3", "Alice Johnson", 1985, "789", true, false, true, false, true);
        functions.retrieveSelfAssessments().add(existingUser);

        // Arrange: Create updated details
        SelfAssessmentUserDetails updatedDetails = new SelfAssessmentUserDetails("UserID3", "Alice Smith", 1985, "789", false, true, false, true, false);

        // Act: Call the method to update user details
        boolean result = functions.updateUserDetails("UserID3", updatedDetails);

        // Assert: Check if the update was successful
        assertTrue(result);

        // Assert: Check if the user details are updated
        LinkedList<SelfAssessmentUserDetails> userList = functions.retrieveSelfAssessments();
        SelfAssessmentUserDetails updatedUser = userList.stream().filter(user -> user.getUserID().equals("UserID3")).findFirst().orElse(null);
        assertNotNull(updatedUser);
        assertEquals("Alice Smith", updatedUser.getName());
        assertFalse(updatedUser.getAnswer1());
        }



}

    // cant create tests from methods to readfilefromjson and writefiletojson 

    // @Test
    // @DisplayName("Test the readDataFromFile method correctly reads data from json file") 
    // public void testReadDataFromFile(){ 
    // }

    // @Test
    // @DisplayName("Test readUserDetailsDataFromFile method with different scenarios")
    // public void testReadUserDetailsDataFromFile(){ 
    // }

    // @Test
    // @DisplayName("Test write data to self assessment file") 
    // public void testWriteDataToSelfAssessmentFile() throws IOException {
    // }

 
    









    

















