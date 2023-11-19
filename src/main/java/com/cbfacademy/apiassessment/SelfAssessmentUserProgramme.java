package com.cbfacademy.apiassessment;

// import java.util.Scanner;
// import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController; 


@SpringBootApplication
@RestController
@ComponentScan("com.cbfacademy.apiassessment")

public class SelfAssessmentUserProgramme {
    

    public static void main(String[] args) {
		SpringApplication.run(SelfAssessmentUserProgramme.class , args);		
	}

}
		
