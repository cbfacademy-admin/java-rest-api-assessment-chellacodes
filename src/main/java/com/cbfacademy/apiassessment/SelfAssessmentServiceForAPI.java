package com.cbfacademy.apiassessment;


import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;


// Springboot service layer containing method the the controller class. 

@Service
public class SelfAssessmentServiceForAPI {


    private final SelfAssessmentUserProgrammeFunctions programmeFunctions;
    private final SearchingAlgorithm searchingAlgorithm; 


    public SelfAssessmentServiceForAPI(SelfAssessmentUserProgrammeFunctions programmeFunctions, SearchingAlgorithm searchingAlgorithm) {
        this.programmeFunctions = programmeFunctions;   
        this.searchingAlgorithm = searchingAlgorithm; 
    }

    public LinkedList<Question> retrieveQuestions() {
        return programmeFunctions.retrieveSelfAssessmentQuestions(); 
    }

    public LinkedList<SelfAssessmentUserDetails> retrieveSelfAssessment() {
        return programmeFunctions.retrieveSelfAssessments();
    }
         
    public void createUserSelfAssessment(SelfAssessmentUserDetails userDetails) {
         programmeFunctions.add(userDetails);
    }

    public boolean updateUserSelfAssessment(String userID, SelfAssessmentUserDetails userDetails) {
        return programmeFunctions.updateUserDetails(userID, userDetails);
    }

    public boolean deleteUserSelfAssessment(String userID) {

        return programmeFunctions.deleteUserDetails(userID);
    }

    public Map<String, Boolean> getUserAnswers(String userID) {
        SelfAssessmentUserDetails userDetails = programmeFunctions.getUserDetails(userID); 

        return userDetails.getAnswers();
    }

    public long getOver65sAnswer1() {
        List<SelfAssessmentUserDetails> allUsers = programmeFunctions.retrieveSelfAssessments();
        return searchingAlgorithm.countOver65sReturningFalseToAnswer1(allUsers);
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

        
    


//     public void deleteUser(UUID id) {
//         programmeFunctions.delete(id);
//         writeDataFromSelfAssessmentToFile();
//     }

//     public LinkedList<SelfAssessmentUserDetails> getSelfAssessment() {
//     return listOfSelfAssesementInput;
//     }

// }

    

