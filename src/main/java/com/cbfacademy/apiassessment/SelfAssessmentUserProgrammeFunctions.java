package com.cbfacademy.apiassessment;

import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.LinkedList;


import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Component

// this class contains methods for functions for the Self Assessment Programme 

public class SelfAssessmentUserProgrammeFunctions {

    private LinkedList<Question> questions; 
    private LinkedList<SelfAssessmentUserDetails> userDetailsInput;

    private String jsonFilePathQuestions;
    private String jsonFilePathUserDetails;
    private final Gson gson;

        public SelfAssessmentUserProgrammeFunctions() {
        try {
        jsonFilePathQuestions = ResourceUtils.getFile("classpath:selfAssessmentQuestions.json").getAbsolutePath();
        jsonFilePathUserDetails = ResourceUtils.getFile("classpath:selfAssessmentData.json").getAbsolutePath();
        }
        catch (FileNotFoundException e) {
            jsonFilePathQuestions = "selfAssessmentQuestions.json";
            jsonFilePathUserDetails = "selfAssessmentData.json";
        }
        
        gson = new GsonBuilder().setPrettyPrinting().create(); 
        questions = readDataFromFile();
        userDetailsInput = readUserDetailsDataFromFile();

        

        }

        public LinkedList<Question> retrieveSelfAssessmentQuestions() {
            return questions; 
        }

        public LinkedList<SelfAssessmentUserDetails> retrieveSelfAssessment() {
            return userDetailsInput;
        }
    
        public void add(SelfAssessmentUserDetails recoUserDetails) {

        if (!find(recoUserDetails.getUserID())) {
            userDetailsInput.add(recoUserDetails);
            writeDataFromSelfAssessmentToFile();
        }
        else {
            System.out.println("Self Assessment Record already exists");
        }   
        }

        public boolean find(String userID) {
            return userDetailsInput.stream().anyMatch(l -> l.getUserID().equals(userID));
        }
    

        // code below is reading data from the JSON file and returning as a list 
            private LinkedList<Question> readDataFromFile() {
                try(Reader reader = new FileReader(jsonFilePathQuestions)) {
                Type listType = new TypeToken<LinkedList<Question>>() {
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

            private LinkedList<SelfAssessmentUserDetails> readUserDetailsDataFromFile() {
                    try(Reader reader2 = new FileReader(jsonFilePathUserDetails)) {
                Type listType2 = new TypeToken<LinkedList<SelfAssessmentUserDetails>>() {
                }.getType();
                return gson.fromJson(reader2, listType2); 
            // if file does not exist returns an empty list
            } catch (FileNotFoundException e) {
                return new LinkedList<>(); 
            } catch (IOException e) {
                e.printStackTrace();
                return new LinkedList<>(); 
            }

            }

              private void writeDataFromSelfAssessmentToFile() {
            try(Writer writer = new FileWriter(jsonFilePathUserDetails)){
            gson.toJson(userDetailsInput, writer); 
            } catch (IOException e) {
            e.printStackTrace();
            }
        }

        public boolean updateUserDetails(String userID, SelfAssessmentUserDetails userDetails) {
            for(SelfAssessmentUserDetails user : userDetailsInput) {
        // if userID provided == userID within json file then update the user details
            if (user.getUserID().equals(userID)) {
                user.setFirstName(userDetails.getFirstName());
                user.setLastName(userDetails.getLastName());
                user.setYearOfBirth(userDetails.getYearOfBirth());
                user.setContactNumber(userDetails.getContactNumber());
                user.setAnswer1(userDetails.getAnswer1());
                user.setAnswer2(userDetails.getAnswer2());
                user.setAnswer3(userDetails.getAnswer3());
                user.setAnswer4(userDetails.getAnswer4());
                user.setAnswer5(userDetails.getAnswer5());
                writeDataFromSelfAssessmentToFile();
                return true;                
                }
            }  
            // returns false if no match is found after the loop 
            return false; 
        }

        public boolean deleteUserDetails(String userID) {
        // Iterator method allows to iterate over the elements in the userDetailsInput (list), contains there methods within the Iterator Class; hasNext() , next() , remove() to traverse LinkedList
        Iterator<SelfAssessmentUserDetails> iterator = userDetailsInput.iterator();
        while (iterator.hasNext()) {
            SelfAssessmentUserDetails user = iterator.next(); 
            if (user.getUserID().equals(userID)) {
                iterator.remove();;
                writeDataFromSelfAssessmentToFile();;
                return true;
            }
        }
        return false;
        }

        }
    



        













    

