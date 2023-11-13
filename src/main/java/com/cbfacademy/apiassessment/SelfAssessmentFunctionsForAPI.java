package com.cbfacademy.apiassessment;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.LinkedList;



import org.springframework.stereotype.Service;

// Service class to manage user input data, 

// adapt methods; read , write , update , delete  from SelfAssessmentFunctions to 

public class SelfAssessmentFunctionsForAPI {

    private LinkedList<SelfAssessmentUserDetails> listOfSelfAssesementInput; 
    private final String jsonFile = selfAssessmentData.json;
    private final Gson gson;

    public SelfAssessmentFunctionsForAPI() {

        listOfSelfAssesementInput = readDataFromFile(); 
        gson = new GsonBuilder().setPrettyPrinting.create(); 

    }

    private LinkedList<SelfAssessmentUserDetails> readDataFromFile() {
        try(Reader reader = new FileReader(jsonFile)) {
            Type listType = new TypeToken<LinkedList<SelfAssessmentUserDetails>> {}.getType(); 
            return gson.fromJson(reader, listType); 
        } catch (FileNotFoundException e) {
            return new LinkedList<>(); 
        } catch (IOException e) {
            e.printStackTrace();
            return new LinkedList<>(); 
        }
    }
    
// create a user following input of answering the variables from SelfAssessmentUserDetails (self assessment)
    public void createUser(SelfAssessmentUserDetails recordOfDetails) {

        if (!find(recordOfDetails.getUserID())) {
            listOfSelfAssesementInput.add(recordOfDetails);
            // update JSON 
        }
        else {
            System.out.println("Self Assessment Record already exists");
        }   
    }

// update user when called by the ID and save the changes to the json file 
    public void updateUserSelfAssessment(UUID userID) {


    }
   
// retrieve a user self assessment through a json file when userID is used 
    public void getUserSelfAssessment(UUID userID) {


    }

    public void saveUserSelfAssessment(UUID userID) {


    }

// method to delete a user self assessment stored in a json file and then make the changes to the json file 


    public void deleteUserSelfAssessment(UUID recUserID) {

        SelfAssessmentUserDetails recordDelete = null; 

        for(SelfAssessmentUserDetails ll : listOfSelfAssesementInput) {

        if (ll.getUserID() == recUserID) {
            recordDelete = ll; 
            }
        }
        if (recordDelete == null) {
            System.out.println("Invalid userID , please try again");
            }
        else {
            listOfSelfAssesementInput.remove(recordDelete); 
            System.out.println("Self Assessment User Record Deleted ");
            }
        }

// retrieve data stored from the JSON file 

    private LinkedList<SelfAssessmentUserDetails> displaySelfAssessment() {

    }


// method needs to write date to the jSON file once createUser method has been inputted

  


   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
 }




    

