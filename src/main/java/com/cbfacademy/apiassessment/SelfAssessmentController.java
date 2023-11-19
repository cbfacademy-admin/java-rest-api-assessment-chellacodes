package com.cbfacademy.apiassessment;

import java.util.LinkedList;
// import java.util.UUID;

// import javax.swing.RepaintManager;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
// import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
@RequestMapping("/api")

public class SelfAssessmentController {

// end points @GetMapping 
    SelfAssessmentServiceForAPI selfAssessmentService;
    public  SelfAssessmentController(SelfAssessmentServiceForAPI selfAssessmentService) {
        this.selfAssessmentService = selfAssessmentService;
    }

// 

// sends a request to retreieve the json file with the self assessment questions 
        @GetMapping("/selfAssessmentQuestions")
         public ResponseEntity <LinkedList<Question>> retrieveSelfAssessmentQuestions(){
         LinkedList<Question> selfAssessmentQuestions = selfAssessmentService.retrieveQuestions();
         return ResponseEntity.ok(selfAssessmentQuestions);
         }

// sends request to retreive the json file with self assessment data 
        @GetMapping("/selfAssessmentData")
         public ResponseEntity <LinkedList<SelfAssessmentUserDetails>> retrieveSelfAssessmentData(){
         LinkedList<SelfAssessmentUserDetails> selfAssessment = selfAssessmentService.retrieveSelfAssessment();
         return ResponseEntity.ok(selfAssessment);
         }

// sends request to create a user self assessment following input into body        
        @PostMapping("/selfAssessmentData/addUser")
        public ResponseEntity<String> createUserDetails(@RequestBody SelfAssessmentUserDetails userDetails) {
        selfAssessmentService.createUserSelfAssessment(userDetails);
        String successMessage = "Self Assessment added successfully";
        return ResponseEntity.status(HttpStatus.CREATED).body(successMessage);
        }

// request to update user, takes in param userID , update json file in body 
        @PutMapping("/selfAssessmentData/userDetails/{userID}")
        public ResponseEntity<String> updateUserDetails(@PathVariable String userID, @RequestBody SelfAssessmentUserDetails userDetails) {
        boolean updated = selfAssessmentService.updateUserSelfAssessment(userID, userDetails);
        if (updated) {
            String successMessage = "Self Assessment updated successfully";
            return ResponseEntity.ok(successMessage);
        } else {
            String errorMessage = "Self Assessment not found for userID: " + userID;
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
        }
    }

// request to delete user, takes in param userID , updates json file in body
        @DeleteMapping("/selfAssessmentData/userDetails/{userID}")
        public ResponseEntity<String> deleteUserDetails(@PathVariable String userID) {
        boolean deleted = selfAssessmentService.deleteUserSelfAssessment(userID);
        if (deleted) {
            String successMessage = "Self Assessment deleted successfully";
        return ResponseEntity.ok(successMessage);
        } else {
            String errorMessage = "Self Assessment not found for userID: " + userID;
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
        }
    }

    
}
