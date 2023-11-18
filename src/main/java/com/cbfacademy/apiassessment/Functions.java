package com.cbfacademy.apiassessment;




import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Component

// this class contains methods for functions for the Self Assessment Programme 

public class Functions {

    private final Map<String, UserDetails> userAssessmentData;
    private final Set<String> questions = new HashSet<>(); 


    // Jackson ObjectMapper for JSON serialization/deserialization
    private final ObjectMapper objectMapper;

    private LinkedList<UserDetails> listOfSelfAssesementInput; 
    private String jsonFilePath;
    private final Gson gson;

        Functions() {
        try {
        jsonFilePath = ResourceUtils.getFile("classpath:selfAssessmentQuestions.json").getAbsolutePath();
        }
        catch (FileNotFoundException e) {
            jsonFilePath = "selfAssessment.json";
        }
        
        gson = new GsonBuilder().setPrettyPrinting().create(); 
        listOfSelfAssesementInput = readDataFromFile();

        

        }

        public LinkedList<UserDetails> retrieveSelfAssessmentQuestions() {
            return listOfSelfAssesementInput; 
        }
    

        public void add(UserDetails userDetails) {

        if (!find(userDetails.getUserID())) {
            listOfSelfAssesementInput.add(userDetails);
            writeDataFromSelfAssessmentToFile();
        }
        else {
            System.out.println("Self Assessment Record already exists");
        }   
        }

        public boolean find(String userID) {

            for(UserDetails l  : listOfSelfAssesementInput) {

                if (l.getUserID().equals(userID)) {
    
                    System.out.println(l);
                    return true;
                } 
            }
            return false; 
        }
    
       

      

        // public void update (String id, Scanner input) {
        //     if (find(id)) {
        //         UserDetails userRecord = findRecord(id); 

        //         System.out.print("Do you need physical care and support due to difficulties managing with any of the following; personal care, accessing the community, getting in and out of bed, drink and meal prep? "); 
        //         boolean answer1 = input.nextBoolean(); 

        //         System.out.print("Do you have any difficulties ascending and / or descending the stairs? "); 
        //         boolean answer2 = input.nextBoolean();

        //         System.out.print("Do you have any difficulties accessing your bathing facilities? "); 
        //         boolean answer3 = input.nextBoolean();

        //         System.out.print("Do you have difficulties accessing your property?"); 
        //         boolean answer4 = input.nextBoolean();

        //         System.out.print("What is the your new answer to Question 5?"); 
        //         boolean answer5 = input.nextBoolean();
            
        //         userRecord.setAnswer1(answer1);
        //         userRecord.setAnswer2(answer2);
        //         userRecord.setAnswer3(answer3);
        //         userRecord.setAnswer4(answer4);
        //         userRecord.setAnswer5(answer5);
        //         System.out.println("Self Asssessment User Record Updated Succesfully"); 
        //         writeDataFromSelfAssessmentToFile();
        //     } else {
        //         System.out.println("Self assessment user record not found");
        //     }
        //     }

        public void display() {
            if (listOfSelfAssesementInput.isEmpty()) {
                System.out.println("No records found");
            }
            for (UserDetails userRecord : listOfSelfAssesementInput) {
                System.out.println(userRecord.toString()); 
            }
        }

        // public void displayAsJsonArray(){
        //     if(UserDetails userRecord : listOfSelfAssesementInput) {
        //         JsonObject jsonRecord = new JsonObject();
        //         jsonRecord.addProperty(jsonFilePath, jsonFilePath);
        //     }
        // }

            
// code below is reading data from the JSON file and returning as a list 
            private LinkedList<UserDetails> readDataFromFile() {
                try(Reader reader = new FileReader(jsonFilePath)) {
                Type listType = new TypeToken<LinkedList<UserDetails>>() {
                }.getType();
                return gson.fromJson(reader, listType); 
// if file does not exist returns an empty list
            } catch (FileNotFoundException e) {
                return new LinkedList<>(); 
            } catch (IOException e) {
                e.printStackTrace();
                return new LinkedList<>(); 
            }
        }

            private void writeDataFromSelfAssessmentToFile() {
            try(Writer writer = new FileWriter(jsonFilePath)){
            gson.toJson(listOfSelfAssesementInput, writer); 
            } catch (IOException e) {
            e.printStackTrace();
            }
        }
    
}
    

