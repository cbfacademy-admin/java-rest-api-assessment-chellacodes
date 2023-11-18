package com.cbfacademy.apiassessment;

import org.springframework.stereotype.Repository;

@Repository

public class SelfAssessmentUsers {


    private static SelfAssessmentUserStorage inputList = new SelfAssessmentUserStorage(); 

    static
        {
            inputList.getSelfAssessment().add(new SelfAssessmentUserDetails(1,"Chella","Johnson",1998,"01159674954",false,true,false,true,false));

            inputList.getSelfAssessment().add(new SelfAssessmentUserDetails(2, "Jane", "Doe", 1970, "01156978403", true, true, true , false, false));
            
            
        }
        
    
    public SelfAssessmentUserStorage getAllSelfAssessment() {
        return inputList; 
    }

    public void addSelfAssessment(SelfAssessmentUserDetails userDetails) {
        inputList.getSelfAssessment().add(userDetails);
    }
    
    }

