package com.cbfacademy.apiassessment;


import java.util.LinkedList;

import org.springframework.stereotype.Service;


// Springboot service layer containing method the the controller class. 

@Service
public class SelfAssessmentServiceForAPI {


    private final SelfAssessmentUserProgrammeFunctions programmeFunctions; 

    public SelfAssessmentServiceForAPI(SelfAssessmentUserProgrammeFunctions programmeFunctions) {
        this.programmeFunctions = programmeFunctions;   
    }

    public LinkedList<Question> retrieveQuestions() {
        return programmeFunctions.retrieveSelfAssessmentQuestions(); 
    }

    public LinkedList<SelfAssessmentUserDetails> retrieveSelfAssessment() {
        return programmeFunctions.retrieveSelfAssessment();
    }
         
    public void createUserSelfAssessment(SelfAssessmentUserDetails answerFromUser) {
         programmeFunctions.add(answerFromUser);
    }

    // public void updateUserSelfAssessment(UUID id, Scanner input) {
    //     programmeFunctions.update(id, input); 
    // }

    // public void deleteUser(UUID id) {
    //      programmeFunctions.delete(id);
    //  }

        
   




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

    

