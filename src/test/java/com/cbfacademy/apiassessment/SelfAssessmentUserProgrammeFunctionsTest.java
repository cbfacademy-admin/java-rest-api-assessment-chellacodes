package com.cbfacademy.apiassessment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.booleanThat;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.LinkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.google.gson.Gson;

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
    @DisplayName("Test the readDataFromFile method correctly reads data from json file") 
    public void testReadDataFromFile(){ 


    }


    @Test
    @DisplayName("Test the delete method correctly delete user based on usertID")
    public void testDeleteUserDetails() {
        functions.add(userDetails);
        boolean deleted = functions.deleteUserDetails("TestUser");
        assertTrue(deleted);
    }

    @Test
    @DisplayName("Test the readsUserDetailDataFromFile methods including if file not found and if IO exception is thrown ")
    public void testReadUserDetailsDataFromFile() {

        String jsonFilePathUserDetails = "selfAssessmentData.json";
        LinkedList<SelfAssessmentUserDetails> expectedUserDetails = new LinkedList<>();
        String json = new Gson().toJson(expectedUserDetails);
        Reader reader = new StringReader(json);
    
        LinkedList<SelfAssessmentUserDetails> result = functions.readUserDetailsDataFromFile();
        assertEquals(expectedUserDetails, result);
        // Arrange for FileNotFoundException
        reader = new StringReader("fakeFile.json");  // An empty string simulates a FileNotFoundException
        // Assert for FileNotFoundException
        assertThrows(FileNotFoundException.class, () -> functions.readUserDetailsDataFromFile(reader));
        // Arrange for IOException
        reader = new StringReader("");  // An empty string simulates an IOException
        // Assert for IOException
        assertThrows(IOException.class, () -> functions.readUserDetailsDataFromFile(reader));
    }

}



    
















}
