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


//         SelfAssessmentUserProgrammeFunctions userProgramme = new SelfAssessmentUserProgrammeFunctions();

//         SelfAssessmentUserDetails userRecord = new SelfAssessmentUserDetails(); 

// 		try (Scanner input = new Scanner(System.in)) {
// 			int option = 0; 

// 			do {
// 				SelfAssessmentProgrammeMenuInterface(); 
// 				option = input.nextInt(); 

// 				switch (option) {

// 				case 1: 

// 					System.out.print("Press any key to generate your userID "); 
// 					input.nextLine(); 
// 					input.nextLine();
// 					UUID userID = userRecord.getUserID(); 
// 					System.out.print("Your user ID is *make note of this!* = " + userID);
// 					input.nextLine();
					
// 					System.out.print("What is your first name? "); 

// 					String firstName = input.nextLine(); 
					
// 					System.out.print("What is your last name? "); 

// 					String lastName = input.nextLine(); 
					
// 					System.out.print("What is your year of birth? "); 

// 					int yearOfBirth = input.nextInt();
				
// 					System.out.print("What is your contact number? "); 

// 					String contactNumber = input.nextLine(); 
// 					input.nextLine(); 
					
// 					System.out.println("Do you need physical care and support due to difficulties managing with any of the following; personal care, accessing the community, getting in and out of bed, drink and meal prep? ");
					
// 					boolean answer1 = input.nextBoolean(); 
						
// 					System.out.println("Do you have any difficulties ascending and / or descending the stairs? ");
// 					boolean answer2 = input.nextBoolean();
						
// 					System.out.println("Do you have any difficulties accessing your bathing facilities? ");
// 					boolean answer3 = input.nextBoolean();
						

// 					System.out.println("Do you have difficulties accessing your property? ");
// 					boolean answer4 = input.nextBoolean();
						
// 					System.out.println("Do you have difficulties transferring on and off the bed, chair, toilet, sofa? ");
// 					boolean answer5 = input.nextBoolean(); 

// 					userRecord = new SelfAssessmentUserDetails(userID, firstName, lastName, yearOfBirth, contactNumber, answer1, answer2, answer3, answer4, answer5);

// 					userProgramme.add(userRecord);
// 					System.out.println(userRecord.toString()); 

// 					break;

// 				case 2: 

// 					System.out.print("What is your user ID?"); 
// 					String uuidInput = input.nextLine();
// 				try {
// 					UUID deleteRecord = UUID.fromString(uuidInput); 
// 					userProgramme.delete(deleteRecord); 
// 				} 

// 				catch (IllegalArgumentException e) {
// 					System.out.println("Invalid userID");

// 				}
				

// 					break; 

// 				case 3:
					
// 					System.out.print("What is your your user name? "); 
// 					String uuidIDUpdate = input.nextLine(); 	
// 					try {
// 						UUID updateRecod = UUID.fromString(uuidIDUpdate);
// 						userProgramme.update(updateRecod, input);
// 					} 

// 					catch (IllegalArgumentException e) {
// 					System.out.println("Invalid userID");

// 					}

					
// 				case 4: 

// 					System.out.print("What is your user name?"); 
// 					String uuidInputFindRecord = input.nextLine();
			
// 					try {
// 						UUID findRecord = UUID.fromString(uuidInputFindRecord); 
// 						userProgramme.find(findRecord); 
// 					} 

// 					catch (IllegalArgumentException e) {
// 					System.out.println("Invalid userID");
// 					}

// 					break;
// // display method working in interface. 
// 				case 5: 
// 					userProgramme.display();
// 					break; 

// 				case 6: 
// 					System.out.println("End of Self Assessment. Thank you for your time");
// 					System.exit(0);

// 					break; 
				
// 				default: 
// 					System.out.println(" Invalid input please select options 1 to 6");
// 					break; 
					
// 				}
// 			}

// 			while (option != 6);
// 		} 
// 	}

// 	public static void SelfAssessmentProgrammeMenuInterface() {
	 
// 			// Printing statements displaying menu on console

// 			System.out.println("Please choose an option below");
// 			System.out.println("1: Complete Self Assessment");
// 			System.out.println("2: Delete Users Self Assessment");
// 			System.out.println("3: Update Self Assessment");
// 			System.out.println("4: Search User");
// 			System.out.println("5: Display list of completed Self Assessments");
// 			System.out.println("6: Exit program");
// 			System.out.print("Enter your selection : ");
// 		}
		

	}

}
		
