package com.cbfacademy.apiassessment;

import java.util.LinkedList;
import java.util.Scanner;
 

public class SelfAssessmentCRUD{

    LinkedList<SelfAssessmentUserDetails> list;

    public SelfAssessmentCRUD() {

        list = new LinkedList<>();

    }

    public void add(SelfAssessmentUserDetails record) {

        // method to check if user details exists if not add it to user detail record. 

        if (!find(record.getUserID())) {
            list.add(record);
        }

        else {

            System.out.println("User not found in file");

        }   
    }

    // method to search user self ax from user id number. 

    public boolean find(int userID) {

        for(SelfAssessmentUserDetails l  : list) {

            if (l.getUserID() == userID) {

                System.out.println("1");
                return true;
            } 
        }
        return false; 

    }



    public void delete (int recUserID) {

        SelfAssessmentUserDetails recordDel = null;

    for (SelfAssessmentUserDetails ll : list) {
    // Finding record to be deleted by id Number
        if (ll.getUserID() == recUserID) {
            recordDel = ll;
            }
    }   

    if (recordDel == null) {

        System.out.println("Invalid user ID");
    }
    else {

        list.remove(recordDel); 

        System.out.println("Succesfully removed user ID from the list"); 
    }

}

public SelfAssessmentUserDetails findRecord (int userID) {
    // Iterate Record list
    // using for each loop
    for (SelfAssessmentUserDetails l : list) {
    
            // Checking record by id Number.
            if (l.getUserID() == userID) {
                return l;
            }
        }
 
        return null;
}


public void update(int id, Scanner input) {

    if (find(id)) {
        SelfAssessmentUserDetails rec = findRecord(id);

        // Display message only
        System.out.print(
            "What is the new User ID Number ? ");
        int userID = input.nextInt();
        input.nextLine();

        // Display message only
        System.out.print(
            "What is the the new First Name");
        String firstName = input.nextLine();
        input.nextLine();

        System.out.print(
            "What is the the new Last Name");
        String lastName = input.nextLine();
        input.nextLine();

        System.out.print("What is the new year of Birth");
        int yearOfBirth = input.nextInt();


        System.out.print("What is the new contact Number");
        String contactNumber = input.nextLine();

         System.out.print(
            "What is the the new answer for question 1");
        boolean answer1 = input.nextBoolean();

          System.out.print(
            "What is the the new answer for question 2");
        boolean answer2 = input.nextBoolean();

          System.out.print(
            "What is the the new answer for question 3");
        boolean answer3 = input.nextBoolean();

          System.out.print(
            "What is the the new answer for question 4");
        boolean answer4 = input.nextBoolean();

          System.out.print(
            "What is the the new answer for question 5");
        boolean answer5 = input.nextBoolean();

        rec.setUserID(userID);
        rec.setFirstName(firstName);
        rec.setLastName(lastName);
        rec.setYearOfBirth(yearOfBirth);
        rec.setContactNumber(contactNumber);
        rec.setAnswer1(answer1); 
        rec.setAnswer2(answer2); 
        rec.setAnswer3(answer3); 
        rec.setAnswer4(answer4); 
        rec.setAnswer5(answer5); 

        System.out.println("Record Updated Successfully");
        }

       else {

        // Print statement
        System.out.println("Record Not Found in the Student list");
    }

    }

    public void display() {

        if (list.isEmpty()) {

            System.out.println("The list has no records"); 
        }

        for (SelfAssessmentUserDetails userDetailsRecord : list) {

        System.out.println(userDetailsRecord.toString()); 
        }
    }
}

