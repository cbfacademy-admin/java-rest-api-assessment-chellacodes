package com.cbfacademy.apiassessment;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Service
public class ServiceClass {

    // Define the path to the JSON file
    private static final String JSON_FILE_PATH = "user_assessments.json";
    private static final String QUESTIONS_FILE_PATH = "selfAssessmentQuestions.json";

    // Simulating data storage using an in-memory map
    private final Map<String, UserDetails> userAssessmentData;
    private final Set<String> questions = new HashSet<>(); 


    // Jackson ObjectMapper for JSON serialization/deserialization
    private final ObjectMapper objectMapper;

    // Constructor to initialize the service
    public ServiceClass() {
        this.userAssessmentData = new HashMap<>();
        this.objectMapper = new ObjectMapper();
        // Load existing data from JSON file on service initialization
        loadUserDataAndQuestionsFromJson();
    }

 
    public UserDetails getSelfAssessment(String userID) {
        return userAssessmentData.get(userID);
    }

    public Set<String> getSelfAssessmentQuestions() {
        try {File jsonQuestionFile = new File(QUESTIONS_FILE_PATH);
            if (jsonQuestionFile.exists()) {
                // Read data from JSON file and return the questions
                QuestionsJSON questionsList = objectMapper.readValue(jsonQuestionFile, QuestionsJSON.class);
                return new HashSet<>(questionsList.getQuestions());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Collections.emptySet();
        }


    public void createUserSelfAssessment(UserDetails userDetails) {
        userAssessmentData.put(userDetails.getUserID(), userDetails);

        // Save updated data to the JSON file
        saveUserDataToJson();
    }

    
    public void updateUserSelfAssessment(String userID, UserDetails updatedDetails) {
        userAssessmentData.put(userID, updatedDetails);

        // Save updated data to the JSON file
        saveUserDataToJson();
    }

    public void deleteUserSelfAssessment(String userID) {
        userAssessmentData.remove(userID);

        // Save updated data to the JSON file
        saveUserDataToJson();
    }

    // Helper method to load user data from the JSON file
    private void loadUserDataAndQuestionsFromJson() {
        try {
            File jsonFileUserData = new File(JSON_FILE_PATH);
            File jsonQuestionFile = new File (QUESTIONS_FILE_PATH);
            if (jsonFileUserData.exists() && jsonQuestionFile.exists()) {
                // Read data from JSON file and populate the in-memory map
                UserDetails[] userDetailsArray = objectMapper.readValue(jsonFileUserData, UserDetails[].class);
                for (UserDetails userDetails : userDetailsArray) {
                    userAssessmentData.put(userDetails.getUserID(), userDetails);
                }

                QuestionsJSON questionList = objectMapper.readValue(jsonQuestionFile, QuestionsJSON.class);
                this.questions.addAll(questionList.getQuestions());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Helper method to save user data to the JSON file
    private void saveUserDataToJson() {
        try {
            // Convert in-memory map to an array and write to JSON file
            UserDetails[] userDetailsArray = userAssessmentData.values().toArray(new UserDetails[0]);
            objectMapper.writeValue(new File(JSON_FILE_PATH), userDetailsArray);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

