package com.cbfacademy.apiassessment;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping("/adlassessment")
public class AdlController { 

    @Autowired 
    private SelfAssessmentUsers selfAssessmentUsers; 

        @GetMapping(
            path = "/",
            produces = "application/json")

        public SelfAssessmentUserStorage getSelfAssessment() {

            return selfAssessmentUsers.getAllSelfAssessment();
        }

        @PostMapping(
            path = "/",
            consumes = "application/json",
            produces = "application/json")

        public ResponseEntity<Object> addSelfAssessment(
            @RequestBody SelfAssessmentUserDetails selfAssessmentUsersDetails) {
        
                Integer id = selfAssessmentUsers.getAllSelfAssessment().getSelfAssessment().size() + 1;
                selfAssessmentUsersDetails.setUserID(id);
                selfAssessmentUsers.addSelfAssessment(selfAssessmentUsersDetails);

                URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(selfAssessmentUsersDetails.getUserID()).toUri();

                return ResponseEntity.created(location).build();
            }
        

    
}
