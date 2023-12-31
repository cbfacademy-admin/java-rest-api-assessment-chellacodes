# Activities of Daily Living Self Assessment 

A Spring Boot API for managing self assessment user details and returning useful information based on the input. 

## Description

The SelfAssessmentAPI is an API that provides a platform for users to perform self-assessments based on a set of questions. The project includes classes for managing user details, a service for program functions, and controllers for handling HTTP requests. The API allows users to perform CRUD operations on self-assessment data. It includes features like user creation, updating, and retrieving useful information based on results. 

## Class structure

### Getters and Setters

SelfAssessmentUserDetails.java

This class represents the details of a user performing a self-assessment. It includes attributes such as userID, name, yearOfBirth, contactNumber, and answers to specific assessment questions. The class also provides methods for retrieving and updating user details.

Question.java

This class represents a set of predefined questions for a self-assessment. It serves as a container for questions related to various aspects of an individual's physical care and accessibility. Each question is encapsulated as a private field with corresponding getter and setter methods.

### Functions

SelfAssessmentUserProgrammeFunctions.java

This class contains methods for program functions related to the Self Assessment Programme. It handles the storage and retrieval of self-assessment questions and user details using JSON files. The class includes methods for adding, updating, and deleting user details.

### Controllers

SelfAssessmentController.java

This class is a REST controller that handles HTTP requests related to self-assessment questions and user details. It includes endpoints for retrieving questions, retrieving user details, adding a new user assessment, updating user details, and deleting user details.

SelfAssessmentResultsController.java

The SelfAssessmentResultsController class is another REST controller responsible for handling requests related to self-assessment results. It includes an endpoint for retrieving results based on a user's ID and a specialized endpoint for obtaining the count of users over 65 who answered a specific question.

### Service 

SelfAssessmentServiceForAPI.java

This class serves as the service layer for the SelfAssessmentAPI, containing methods utilized by the controller class. It orchestrates the communication between the controller, program functions, and the searching algorithm.

### Algorithm 

SearchingAlgorithm.java 

This class provides a method to count the number of users over the age of 65 who answered a specific question negatively. This class is designed to work with a list of SelfAssessmentUserDetails objects. The countOver65sReturningFalseToAnswer1 takes a list of user details as input, uses Java streams to filter users born in or before 1957 who answered a specific question (answer1) with false. The method then returns the count of matching users.

### Programme 

SelfAssessmentUserProgramme.java 

This class serves as the entry point for the SelfAssessmentAPI application. It uses the Spring Boot @SpringBootApplication annotation to bootstrap the application, making it executable. The class also includes the main method (public static void main(String[] args)) responsible for launching the Spring Boot application.

### Link to published PostMan Documentation 

[PostMan Documentation](https://documenter.getpostman.com/view/31214081/2s9Ye8fuov#97f450c0-bbdb-4c7e-b719-cf71bc4944f3)
      
### Acknowledgments

Thank you Coding Black Females for giving me the knowledge and inspiration to complete this project 
