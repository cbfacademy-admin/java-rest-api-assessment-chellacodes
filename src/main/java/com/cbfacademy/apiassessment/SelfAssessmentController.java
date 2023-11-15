package com.cbfacademy.apiassessment;

import java.util.LinkedList;
import java.util.UUID;

import javax.swing.RepaintManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    @GetMapping("/selfAssessment")
    public ResponseEntity <LinkedList<SelfAssessmentUserDetails>> retrieveSelfAssessment(){
        LinkedList<SelfAssessmentUserDetails> selfAssessment = selfAssessmentService.retrieveSelfAssessment();
        return ResponseEntity.ok(selfAssessment);
    }


// creates the user self assessment
    @PostMapping("")
    public ResponseEntity createUserSelfAssessment(@RequestMapping SelfAssessmentUserDetails answersFromUser) {
        selfAssessmentService.createUserSelfAssessment(answersFromUser);
        return ResponseEntity.ok().build();
    }


// sends request to retreive json file with useful information to answers to the questions 
    @GetMapping



// allows user to update there self assessment following having access to the useful information
    @PutMapping
    public ResponseEntity<Void> updateUserSelfAssessment(@PathVariable UUID id, @RequestBody SelfAssessmentUserDetails updateDetails) {
        selfAssessmentService.updateUserSelfAssessment(id, updateDetails);
        return ResponseEntity.ok().build();
    }


// allows user to delete self assessment with there details 
    @DeleteMapping

    
}