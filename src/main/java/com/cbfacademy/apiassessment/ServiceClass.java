package com.cbfacademy.apiassessment;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

@Service
public class ServiceClass {

    private final Functions functions; 


   


    // Constructor to initialize the service
    public ServiceClass(Functions functions) {
        this.functions = functions; 
    }



    public LinkedList<UserDetails> retrieveSelfAssessmentQuestions() {
        return functions.retrieveSelfAssessmentQuestions();
        }


    public void createUserSelfAssessment(UserDetails answers) {
        functions.add(answers);
    }


    public void updateUserSelfAssessment(String id) {
        functions.update(id); 
    }

    public void deleteUser(String userID) {
         functions.remove(userID);



    
}

}