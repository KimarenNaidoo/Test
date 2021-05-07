package masterAccountLogic;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Do you want to create a Master Account?");
		System.out.println("Type 1: Yes, any other key: No");
		
		int choice = scan.nextInt();
		String firstName, lastName, phoneNumber, homeNumber, email;
		
		if(choice == 1) {
			MasterAccount masterAcc;
			
			System.out.println("Enter users first name: ");
			firstName = scan.nextLine();			
			System.out.println("Enter users last name: ");
			lastName = scan.nextLine();
			System.out.println("Enter users phone number: ");
			phoneNumber = scan.nextLine();
			System.out.println("Enter users office or home number: ");
			homeNumber = scan.nextLine();
			System.out.println("Enter users email: ");
			email = scan.nextLine();
			
			if(firstName != null && lastName != null && email != null && (phoneNumber != null || homeNumber != null)) {
				masterAcc = new MasterAccount(firstName, lastName, phoneNumber, homeNumber, email);
				System.out.println("Master account created");
				
				System.out.println("User unique id is: " + masterAcc.getUuid());
				System.out.println("User full name is: " + masterAcc.getFirstName() + " " + masterAcc.getLastName());
				
				if(phoneNumber != null) {
					System.out.println("User contact details (phone number): " + masterAcc.getPhoneNumber());
				}else {
					System.out.println("User contact details (home number): " + masterAcc.getHomeNumber());
				}
				
				System.out.println("User email is: " + masterAcc.getEmail());
			}else {
				System.out.println("Please complete all fields.");
			}	
			
			
		}else {
			System.out.println("Thank you.");
		}
		
		scan.close();
	}

	

}