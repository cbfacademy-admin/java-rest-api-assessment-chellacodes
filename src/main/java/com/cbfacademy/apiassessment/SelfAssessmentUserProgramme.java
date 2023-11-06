package com.cbfacademy.apiassessment;

import java.util.Scanner; 

public class SelfAssessmentUserProgramme {
    

    public static void main(String[] args) {

        SelfAssessmentUserProgrammeFunctions userProgramme = new SelfAssessmentUserProgrammeFunctions();

        SelfAssessmentUserDetails userRecord = new SelfAssessmentUserDetails(); 


		userRecord.setUserID("JD1998");
        userRecord.setFirstName("Jane");
		userRecord.setLastName("Doe");
		userRecord.setYearOfBirth(1998);
		userRecord.setContactNumber("07490685102");
		userRecord.setAnswer1(false);
		userRecord.setAnswer2(false);
		userRecord.setAnswer3(false);
		userRecord.setAnswer4(true);
		userRecord.setAnswer5(true);

		userProgramme.add(userRecord); 

		Scanner input = new Scanner(System.in);

		int option = 0; 

		do {
			SelfAssessmentProgrammeMenuInterface(); 
			option = input.nextInt(); 

			switch (option) {

			case 1: 

				System.out.print("What is your chosen User ID?"); 

				String userID = input.nextLine(); 
				input.nextLine();
				
				System.out.print("What is your first name?"); 

				String firstName = input.nextLine(); 
				
				System.out.print("What is your last name?"); 

				String lastName = input.nextLine(); 
				
				System.out.print("What is your year of birth?"); 

				int yearOfBirth = input.nextInt();
			
				System.out.print("What is your contact number?"); 

				String contactNumber = input.nextLine(); 
				input.nextLine(); 
				
				System.out.println("Do you need physical care and support due to difficulties managing with any of the following; personal care, accessing the community, getting in and out of bed, drink and meal prep?");
				
				boolean answer1 = input.nextBoolean(); 
					
				System.out.println("Do you have any difficulties ascending and / or descending the stairs?");
				boolean answer2 = input.nextBoolean();
					
				System.out.println("Do you have any difficulties accessing your bathing facilities?");
				boolean answer3 = input.nextBoolean();
					

				System.out.println("Do you have difficulties accessing your property?");
				boolean answer4 = input.nextBoolean();
					
				System.out.println("Do you have difficulties transferring on and off the bed, chair, toilet, sofa?");
				boolean answer5 = input.nextBoolean(); 

				userRecord = new SelfAssessmentUserDetails(userID, firstName, lastName, yearOfBirth, contactNumber, answer1, answer2, answer3, answer4, answer5);

				userProgramme.add(userRecord);
				System.out.println(userRecord.toString()); 

				break;

			case 2: 
			
				System.out.print("What is your user name?"); 
				String deleteRecord = input.nextLine(); 
				userProgramme.delete(deleteRecord); 

				break; 

			case 3:
				
				System.out.print("What is your user name?"); 
				String updateRecord = input.nextLine(); 
				userProgramme.update(updateRecord, input); 

				break; 

			case 4: 

				System.out.print("What is your user name?"); 
				String findRecord = input.nextLine(); 

				if (!userProgramme.find(findRecord)) {
					System.out.println("Self assessment record does not exist. Please try again"); 
				}

				break; 

			case 5: 
				userProgramme.display();
				break; 

			case 6: 
				System.out.println("End of Self Assessment. Thank you for your time");


				System.out.println("Invalid input please select options 1 to 6"); 
				System.exit(0);

				break; 
			
			default: 
				System.out.println("Invalid input");
				break; 
				
			}
    	}

		while (option != 6); 
	}

	public static void SelfAssessmentProgrammeMenuInterface() {
	 
			// Printing statements displaying menu on console

			System.out.println("Please choose an option below");
			System.out.println("1: Complete Self Assessment");
			System.out.println("2: Delete Users Self Assessment");
			System.out.println("3: Update Self Assessment");
			System.out.println("4: Search User");
			System.out.println("5: Display list of completed Self Assessments");
			System.out.println("6: Exit program");
			System.out.print("Enter your selection : ");
		}
		

	}
		
