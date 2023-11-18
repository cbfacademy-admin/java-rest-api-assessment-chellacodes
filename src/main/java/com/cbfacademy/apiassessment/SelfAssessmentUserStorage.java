package com.cbfacademy.apiassessment;

import java.util.ArrayList;
import java.util.List;

public class SelfAssessmentUserStorage {

    private List<SelfAssessmentUserDetails> selfAssessmentData; 
    
    public List<SelfAssessmentUserDetails> getSelfAssessment() {

        if (selfAssessmentData == null) {

            selfAssessmentData = new ArrayList<>(); 
        }

        return selfAssessmentData;
    }

    public void setSelfAssessment(List<SelfAssessmentUserDetails> selfAssessmentData) {
        this.selfAssessmentData = selfAssessmentData;
    }


}
