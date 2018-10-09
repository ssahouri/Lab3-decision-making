import java.util.Scanner;

public class Lab3DecisionMakingApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int userInput;
		char userContinue = 'y';
		
		System.out.println("Enter your name: ");
		String userName= sc.next();
		//while loop so that after going through user can continue or be done
		while( userContinue == 'y') {

		System.out.println("Enter an integer between 1 and 100 please " + userName +": ");
		userInput = sc.nextInt();

		if ((userInput % 2 == 1) && (userInput < 60)) {
			
			System.out.println(userInput + " Odd");
		}

		else if ((userInput % 2 == 0) && (userInput >= 2) && (userInput < 25) ) {
		
					System.out.println(userInput + " Even and less than 25");

				}

			
		else if((userInput % 2 == 0) &&(userInput >= 26) && (userInput <= 60) ) {
				
					
						System.out.println(userInput +" Even");
					
				}
		else if((userInput % 2 == 0) && (userInput > 60) && (userInput < 100)) {
					 
						System.out.println(userInput + " Even");
					}
					
				
				
		else if ((userInput % 2 == 1) && (userInput > 60) && (userInput < 100)) {
				
						System.out.println(userInput + " Odd and over 60");
					
				}
		//if the number isn't between 1 and 100 it's invalid
			else {
				System.out.println("Invalid Number");
			}
		
				
			  System.out.println("Continue? (y/n): ");
			    userContinue = sc.next().charAt(0);
		}
	//When the user hits something other then y on continue
		System.out.println("Bye " + userName + "!");
		sc.close();
	}
}
