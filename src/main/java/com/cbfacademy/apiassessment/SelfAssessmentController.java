package com.cbfacademy.apiassessment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/activities-of-daily-living-self-assessment")

public class SelfAssessmentController {


    @Autowired
    SelfAssessmentServiceForAPI selfAssessmentService; 

// sends a request to retreieve the json file with the self assessment 
    @GetMapping()
    public ResponseEntity LinkedList<SelfAssessmentUserDetails> getSelfAssessment(){
        LinkedList<SelfAssessmentUserDetails> selfAssessment = selfAssessmentService;
        return ResponseEntity.ok(selfAssessment);
    }


// creates the user self assessment
    @PostMapping


// sends request to retreive json file with useful information to answers to the questions 
    @GetMapping



// allows user to update there self assessment following having access to the useful information
    @PutMapping


// allows user to delete self assessment with there details 
    @DeleteMapping

    
}
