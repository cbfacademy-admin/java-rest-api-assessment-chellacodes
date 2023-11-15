package com.cbfacademy.apiassessment;

import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.UUID;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;



// this class contains methods for functions for the Self Assessment Programme 

public class SelfAssessmentUserProgrammeFunctions {

    private LinkedList<SelfAssessmentUserDetails> listOfSelfAssesementInput; 
    private final String jsonFilePath = "selfAssessmentData.json";
    private final Gson gson;

        public SelfAssessmentUserProgrammeFunctions() {

        listOfSelfAssesementInput = readDataFromFile();
        gson = new GsonBuilder().setPrettyPrinting().create(); 

        }

        public LinkedList<SelfAssessmentUserDetails> retrieveSelfAssessment() {
            return listOfSelfAssesementInput; 
        }
    
        public void add(SelfAssessmentUserDetails recordOfDetails) {

        if (!find(recordOfDetails.getUserID())) {
            listOfSelfAssesementInput.add(recordOfDetails);
            writeDataFromSelfAssessmentToFile();
        }
        else {
            System.out.println("Self Assessment Record already exists");
        }   
        }

        public boolean find(UUID userID) {

            for(SelfAssessmentUserDetails l  : listOfSelfAssesementInput) {

                if (l.getUserID().equals(userID)) {
    
                    System.out.println(l);
                    return true;
                } 
            }
            return false; 
        }
    
        public void delete (UUID recUserID) {

            SelfAssessmentUserDetails recordDelete = null; 

            for(SelfAssessmentUserDetails l : listOfSelfAssesementInput) {
                if (l.getUserID().equals(recUserID)){
                    recordDelete = l; 
                }
            }
            if (recordDelete == null) {
                System.out.println("Invalid userID , please try again");
            } else {
                listOfSelfAssesementInput.remove(recordDelete); 
                System.out.println("Self Assessment User Record Deleted ");
                writeDataFromSelfAssessmentToFile();
            }
        }

        public SelfAssessmentUserDetails findRecord(UUID userID) {
            for (SelfAssessmentUserDetails l : listOfSelfAssesementInput) {
                if (l.getUserID().equals(userID)) {
                    return l; 
                }
            }
            return null; 
        }

        public void update (UUID id, Scanner input) {
            if (find(id)) {
                SelfAssessmentUserDetails userRecord = findRecord(id); 

                System.out.print("Do you need physical care and support due to difficulties managing with any of the following; personal care, accessing the community, getting in and out of bed, drink and meal prep? "); 
                boolean answer1 = input.nextBoolean(); 

                System.out.print("Do you have any difficulties ascending and / or descending the stairs? "); 
                boolean answer2 = input.nextBoolean();

                System.out.print("Do you have any difficulties accessing your bathing facilities? "); 
                boolean answer3 = input.nextBoolean();

                System.out.print("Do you have difficulties accessing your property?"); 
                boolean answer4 = input.nextBoolean();

                System.out.print("What is the your new answer to Question 5?"); 
                boolean answer5 = input.nextBoolean();
            
                userRecord.setAnswer1(answer1);
                userRecord.setAnswer2(answer2);
                userRecord.setAnswer3(answer3);
                userRecord.setAnswer4(answer4);
                userRecord.setAnswer5(answer5);
                System.out.println("Self Asssessment User Record Updated Succesfully"); 
                writeDataFromSelfAssessmentToFile();
            } else {
                System.out.println("Self assessment user record not found");
            }
            }

        public void display() {
            if (listOfSelfAssesementInput.isEmpty()) {
                System.out.println("No records found");
            }
            for (SelfAssessmentUserDetails userRecord : listOfSelfAssesementInput) {
                System.out.println(userRecord.toString()); 
            }
        }

        // public void displayAsJsonArray(){
        //     if(SelfAssessmentUserDetails userRecord : listOfSelfAssesementInput) {
        //         JsonObject jsonRecord = new JsonObject();
        //         jsonRecord.addProperty(jsonFilePath, jsonFilePath);
        //     }
        // }

            
// code below is reading data from the JSON file and returning as a list 
            private LinkedList<SelfAssessmentUserDetails> readDataFromFile() {
                try(Reader reader = new FileReader(jsonFilePath)) {
                Type listType = new TypeToken<LinkedList<SelfAssessmentUserDetails>>() {
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














    

