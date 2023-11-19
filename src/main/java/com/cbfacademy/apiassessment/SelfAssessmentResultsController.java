package com.cbfacademy.apiassessment;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/selfAssessmentResults")
public class SelfAssessmentResultsController {

    @Autowired
    private SelfAssessmentServiceForAPI selfAssessmentService;

    @GetMapping("/{userID}")
    public ResponseEntity<String> getResults(@PathVariable String userID) {
        // Retrieve user's answers
        Map<String, Boolean> userAnswers = selfAssessmentService.getUserAnswers(userID);

        // Generate content based on answers
        String content = generateContent(userAnswers);

        return ResponseEntity.ok(content);
    }



    private String generateContent(Map<String, Boolean> answers) {
        // Logic to map answers to content
        StringBuilder contentBuilder = new StringBuilder();
        if (!answers.get("answer1")) {
            contentBuilder.append("Here is a useful link if you need physical care and support : [Find your local council to access Adult Social Care](https://www.gov.uk/apply-needs-assessment-social-services)\n");
        }
        if (!answers.get("answer2")) {
                contentBuilder.append("Here is a useful link if you are struggling with getting up and down the stairs (You can also try fitting a second stair rail): [Stair lift comparison website](https://www.mobilitycompare.co.uk/stairlifts/?show-form=true&msclkid=0cd3dda3797b131283eab8fa099456b0&utm_source=bing&utm_medium=cpc&utm_campaign=Stairlifts%20Generic&utm_term=stairlifts%20uk&utm_content=Core)\n");
        }
    
        if (!answers.get("answer3")) {
            contentBuilder.append("Here is a useful link if you are struggling with accessing your bathing facilities: [Link to bathroom aids](https://www.careco.co.uk/bathroom/)\n");
        }
    
        if (!answers.get("answer4")) {
            contentBuilder.append("Here is a useful link if you are struggling with accessing your property in any way: [How to ensure safe access link](https://livingmadeeasy.org.uk/dlf-factsheets/adapting-your-home-access-into-and-around-your-home)\n");
        }
    
        if (!answers.get("answer5")) {
            contentBuilder.append("Here is a useful link if you are struggling with getting on and off your; bed, chair, toilet (Explore the bed rails , raisers and toileting equipment section): [Care Co link](https://www.careco.co.uk/furniture/furniture-accessories/furniture-raisers/)\n");
        }

        return contentBuilder.toString();
    }

    @GetMapping("/over65s") 
        public ResponseEntity<Long> algorithmGetOver65sAnswer1() {
            // Call the service to get the count using the new algorithm
            long count = selfAssessmentService.getOver65sAnswer1();
            // Return the count in the response
            return ResponseEntity.ok(count);
    
        }





}






    

