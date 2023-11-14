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


    private final SelfAssessmentUserProgrammeFunctions programmeFunctions; 

    public SelfAssessmentServiceForAPI(SelfAssessmentUserProgrammeFunctions programmeFunctions) {
        this.programmeFunctions = programmeFunctions; 

    }

    public LinkedList<SelfAssessmentUserDetails> retrieveSelfAssessment() {
        return programmeFunctions.retrieveSelfAssessment(); 
    }


























}

//     public SelfAssessmentServiceForAPI(SelfAssessmentUserProgrammeFunctions programmeFunctions) {
//         this.programmeFunctions = programmeFunctions; 
//     }

//     public SelfAssessmentServiceForAPI() {
//         listOfSelfAssesementInput = readDataFromFile();
//         gson = new GsonBuilder().setPrettyPrinting().create();
//     }

    
//     public void createUserSelfAssessment(SelfAssessmentUserDetails recordOfDetails) {
//         programmeFunctions.add(recordOfDetails);
//         writeDataFromSelfAssessmentToFile();
//         }

        
//     public void displayUserSelfAssessmentInputAsJSON() {
//         listOfSelfAssesementInput = readDataFromFile(); 
//     }


//     public void deleteUser(UUID id) {
//         programmeFunctions.delete(id);
//         writeDataFromSelfAssessmentToFile();
//     }

//     public LinkedList<SelfAssessmentUserDetails> getSelfAssessment() {
//     return listOfSelfAssesementInput;
//     }

// }

    

