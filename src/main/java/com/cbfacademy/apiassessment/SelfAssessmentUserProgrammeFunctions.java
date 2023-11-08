package com.cbfacademy.apiassessment;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.UUID;

// this class contains methods for functions for the Self Assessment Programme 

public class SelfAssessmentUserProgrammeFunctions {

    LinkedList<SelfAssessmentUserDetails> listOfSelfAssesementInput; 

        public SelfAssessmentUserProgrammeFunctions() {

        listOfSelfAssesementInput = new LinkedList<>();
        }
    
        public void add(SelfAssessmentUserDetails recordOfDetails) {

        if (!find(recordOfDetails.getUserID())) {
            listOfSelfAssesementInput.add(recordOfDetails);
        }
        else {
            System.out.println("Self Assessment Record already exists");
        }   
        }

        public boolean find(UUID userID) {

            for(SelfAssessmentUserDetails l  : listOfSelfAssesementInput) {

                if (l.getUserID() == userID) {
    
                    System.out.println(l);
                    return true;
                } 
            }
            return false; 
        }
    
        public void delete (UUID recUserID) {

            SelfAssessmentUserDetails recordDelete = null; 

            for(SelfAssessmentUserDetails ll : listOfSelfAssesementInput) {

                if (ll.getUserID() == recUserID) {
                    recordDelete = ll; 
                }
            }
            if (recordDelete == null) {
                System.out.println("Invalid userID , please try again");
            }
            else {
                listOfSelfAssesementInput.remove(recordDelete); 
                System.out.println("Self Assessment User Record Deleted ");
            }
        }

        public SelfAssessmentUserDetails findRecord(UUID userID) {

            for (SelfAssessmentUserDetails l : listOfSelfAssesementInput) {

                if (l.getUserID() == userID) {
                    return l; 
                }
            }
            return null; 
        }

        public void update (UUID id, Scanner input) {
            if (find(id)) {
                SelfAssessmentUserDetails userRecord = findRecord(id); 


                System.out.print("What is the new First Name?");
                String firstName = input.nextLine(); 

                System.out.print("What is the new last Name?"); 
                String lastName = input.nextLine(); 

                System.out.print("What is the new year of birth?"); 
                int yearOfBirth = input.nextInt();

                System.out.print("What is the new contact number?"); 
                String contactNumber = input.nextLine(); 

                System.out.print("What is the your new answer to Question 1?"); 
                boolean answer1 = input.nextBoolean(); 

                System.out.print("What is the your new answer to Question 2?"); 
                boolean answer2 = input.nextBoolean();

                System.out.print("What is the your new answer to Question 3?"); 
                boolean answer3 = input.nextBoolean();

                System.out.print("What is the your new answer to Question 4?"); 
                boolean answer4 = input.nextBoolean();

                System.out.print("What is the your new answer to Question 5?"); 
                boolean answer5 = input.nextBoolean();

                userRecord.setFirstName(firstName);
                userRecord.setLastName(lastName);
                userRecord.setYearOfBirth(yearOfBirth);
                userRecord.setContactNumber(contactNumber);
                userRecord.setAnswer1(answer1);
                userRecord.setAnswer2(answer2);
                userRecord.setAnswer3(answer3);
                userRecord.setAnswer4(answer4);
                userRecord.setAnswer5(answer5);
                System.out.println("Self Asssessment User Record Updated Succesfully"); 
            }

            else {
                System.out.println("Self assessment user record not found");
            }
            }

            public void display() {
                if (listOfSelfAssesementInput.isEmpty()) {
                    System.out.println("No records found");
                }
                for (SelfAssessmentUserDetails userRecord : listOfSelfAssesementInput) {
                    System.out.println(userRecord.toString()); 
                }
            }

			public void update(String uuidIDUpdate) {
			}
        }














    

