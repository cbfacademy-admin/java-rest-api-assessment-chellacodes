package com.cbfacademy.apiassessment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



// Declare my variables as JSON Objects 

// CREATE , READ , UPDATE , DELETE - THESE ARE THESE METHODS 

// Program to store a user detail list . Holding user detail objects that contain users details from self ax form. 

// programme needs to have the following operaitons; ADD , SEARCH , REMOVE AND SHOW DETAILS FROM THE USER SELF AX FORM


@SpringBootApplication
@RestController
public class App {


    // private String firstName; 
    // private String lastName;
    // private Integer yearOfBirth;
    // private String contactNumber; 
    // private Boolean answer1; 
    // private Boolean answer2; 
    // private Boolean answer3;
    // private Boolean answer4; 
    // private Boolean answer5; 

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);}


	@GetMapping("/greeting")
	public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s", name);
	}



}
