package com.cbfacademy.apiassessment;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.LinkedList;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

// Springboot service layer containing method the the controller class. 

@Service
public class SelfAssessmentServiceForAPI {

    private final String jsonFile = "selfAssessmentData.json";
    private final Gson gson;

    LinkedList<SelfAssessmentUserDetails> listOfSelfAssesementInput; 

    public SelfAssessmentServiceForAPI() {
        listOfSelfAssesementInput = readDataFromFile();
        gson = new GsonBuilder().setPrettyPrinting().create();
    }
    

// code below is reading data from the JSON file and returning as a list 
    private LinkedList<SelfAssessmentUserDetails> readDataFromFile() {
        try(Reader reader = new FileReader(jsonFile)) {
            Type listType = new TypeToken<LinkedList<SelfAssessmentUserDetails>> {}.getType(); 
        return gson.fromJson(reader, listType); 
        // if file does not exist returns an empty list
        } catch (FileNotFoundException e) {
            return new LinkedList<>(); 
        } catch (IOException e) {
            e.printStackTrace();
            return new LinkedList<>(); 
        }
    }

// code below is a method to write the dta from the self assessment user input into the Json file 
    private void writeDataFromSelfAssessmentToFile() {
        try(Writer writer = new FileWriter(jsonFile)){
            gson.toJson(listOfSelfAssesementInput, writer); 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    public void createUserSelfAssessment(SelfAssessmentUserDetails recordOfDetails) {
        add(recordOfDetails);
        writeDataFromSelfAssessmentToFile();
        }


    public void displayUserSelfAssessmentInputAsJSON() {
        listOfSelfAssesementInput = readDataFromFile(); 
    }


    public void deleteUser(UUID id) {
        delete(id);
        writeDataFromSelfAssessmentToFile();
    }

    public LinkedList<SelfAssessmentUserDetails> getSelfAssessmentUserDetails() {
    return listOfSelfAssesementInput;
    }

}

    

