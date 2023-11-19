package com.cbfacademy.apiassessment;

import java.util.List;

import org.springframework.stereotype.Component;

// method is taking in a list of SelfAssessmentUserDetails as input and using Java streams to filter users born <= 1957 and return false
// count function used to count matching users  

@Component
public class SearchingAlgorithm {

    public long countOver65sReturningFalseToAnswer1 (List<SelfAssessmentUserDetails> userDetailsList) {
        return userDetailsList.stream()
        .filter(user -> user.getYearOfBirth() <= 1957).
        filter(user -> !user.getAnswer1())
        .count();
    }
    
}
