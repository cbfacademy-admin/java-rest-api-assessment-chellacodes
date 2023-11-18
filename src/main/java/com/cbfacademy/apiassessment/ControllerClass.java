package com.cbfacademy.apiassessment;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/self-assessment")
public class ControllerClass {

    @Autowired
    private ServiceClass selfAssessmentService;

    // GET Request to retrieve self-assessment as a JSON file
    @GetMapping("/questions")
    public ResponseEntity<Set<String>> getSelfAssessmentQuestions() {
        Set<String> questions = selfAssessmentService.getSelfAssessmentQuestions();
        if (questions != null && !questions.isEmpty()) {
            return ResponseEntity.ok(questions);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    // POST Request to create user self-assessment
    @PostMapping
    public ResponseEntity<Void> createUserSelfAssessment(@RequestBody UserDetails userDetails) {
        selfAssessmentService.createUserSelfAssessment(userDetails);
        return ResponseEntity.ok().build();
    }

    // // PUT Request to retrieve an HTML page with useful information based on answers
    // @PutMapping("/html/{userId}")
    // public ResponseEntity<String> getHtmlInfoBasedOnAnswers(@PathVariable String userId) {
    //     String htmlInfo = selfAssessmentService.getHtmlInfoBasedOnAnswers(userId);
    //     return ResponseEntity.ok(htmlInfo);
    // }

    // PUT Request to update user self-assessment
    @PutMapping("/{userId}")
    public ResponseEntity<Void> updateUserSelfAssessment(
            @PathVariable String userId,
            @RequestBody UserDetails updatedDetails) {
        selfAssessmentService.updateUserSelfAssessment(userId, updatedDetails);
        return ResponseEntity.ok().build();
    }

    // DELETE Request to delete user self-assessment
    @DeleteMapping("/{userId}")
    public ResponseEntity<Void> deleteUserSelfAssessment(@PathVariable String userId) {
        selfAssessmentService.deleteUserSelfAssessment(userId);
        return ResponseEntity.ok().build();
    }
}

