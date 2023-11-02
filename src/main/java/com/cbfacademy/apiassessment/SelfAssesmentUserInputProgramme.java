package com.cbfacademy.apiassessment;


import java.util.Scanner;


// int, userID, String firstName, String lastName, int yearOfBirth, String contactNumber, 
// boolean answer1, boolean answer2, boolean answer3, boolean answer4, boolean answer5

public class SelfAssesmentUserInputProgramme {
    public static void main(String[] args) {
    
	SelfAssessmentCRUD userDetailRecord = new SelfAssessmentCRUD();

	SelfAssessmentUserDetails record = new SelfAssessmentUserDetails();
		

		// below I am creating an initial self ax user record making sure to use the correct types for each variable   
        record.setUserID(1);
		record.setFirstName("Jane");
		record.setLastName("Doe");
		record.setYearOfBirth(1998);
		record.setContactNumber("07490685102");
		record.setAnswer1(false);
		record.setAnswer2(false);
		record.setAnswer3(false);
		record.setAnswer4(false);
		record.setAnswer5(false);

		
		// the code below is calling the add method to add data to linked list (soon be stored in json file)
		userDetailRecord.add(record);

		// Creating scanner object to read user input 

		Scanner input = new Scanner(System.in); 

		int option = 0; 

		// While loop 

		do {
            menu();
			option = input.nextInt();

			switch (option) {
				case 1:
				// takes input of userID
				// takes in input of int for user ID
					System.out.print("User ID: " );
					int userID = input.nextInt();
					input.nextLine();
				
			
					// asks for first name to be inputted 
					System.out.print("First Name: ");
					String firstName = input.nextLine();
					input.nextLine();
			
					
				// moves to next line
					// input.nextLine(); 
					System.out.println("Last Name: ");
					String lastName = input.nextLine(); 
					input.nextLine();
			

					System.out.println("What is your Year of Birth? ");
					int yearOfBirth = input.nextInt();
					input.nextLine();
					 

					System.out.print("What is you contact number? "); 
					String contactNumber = input.nextLine();
		
				

					System.out.println("Do you need physical care and support due to difficulties managing with any of the following; personal care, accessing the community, getting in and out of bed, drink and meal prep");
					boolean answer1 = input.nextBoolean(); 
					

					System.out.println("Do you have any difficulties ascending and / or descending the stairs?");
					boolean answer2 = input.nextBoolean();
					

					System.out.println("Do you have any difficulties accessing your bathing facilities?");
					boolean answer3 = input.nextBoolean();
					

					System.out.println("Do you have difficulties accessing your property?");
					boolean answer4 = input.nextBoolean();
					

					System.out.println("Do you have difficulties transferring on and off the bed, chair, toilet, sofa?");
					boolean answer5 = input.nextBoolean(); 
		


                    // calling add method to record (need to find out if this is where the Record class needs to be as json / gson class)
					record = new SelfAssessmentUserDetails(userID, firstName, lastName, yearOfBirth, contactNumber, answer1, answer2, answer3, answer4, answer5); 
					
					userDetailRecord.add(record);
					System.out.println(record.toString());

					break;

                // case 2 is method to delete data 

                case 2: 

                    System.out.print("What is the User ID number?");
                    int deleteInfo = input.nextInt();

                    // allows to delete record from userDetailsSelfAX

                    userDetailRecord.delete(deleteInfo); 

					break;

                case 3: 

                    System.out.print("What is the User ID number");
                    int updateID = input.nextInt(); 
                    userDetailRecord.update(updateID, input);
				
					break;
                
                case 4: 
                    System.out.print("What is the User ID number"); 
                    int findId = input.nextInt(); 

                    if (!userDetailRecord.find(findId)) {
                        System.out.println("User Details not found");

                    }

					break;

                case 5:
                        userDetailRecord.display();
                        break;

                case 6: 
                    
                    System.out.println("End of programme"); 
                    System.exit(0); 

                    break; 
            
                default: 

                    System.out.println("Invalid input");
                    break;


			}
        }

        while (option != 6);
	
    }


    public static void menu() {

        System.out.println("MENU");
        System.out.println("1: Complete Self Ax form");
        System.out.println("2: Delete User Details");
        System.out.println("3: Update User Details");
        System.out.println("4: Search User Details");
        System.out.println("5: Display User Details");
        System.out.println("6: Exit program");
        System.out.print("Enter your selection : ");
    }

}




