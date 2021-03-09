package sololearnLoops;

import java.util.Scanner;

public class doWhileLoops {

	public static void main(String[] args) {
		
		/* Automated phone system for bank clients.
		 * Number selections activate actions.  First 4 commands
		 * can be used in a random sequence without interrupting 
		 * the phone call.  The number 0 ends the call.
		 */
		Scanner scanner = new Scanner(System.in);
		int number;
		do {number = scanner.nextInt();
		if (number==1) {
			System.out.println("Language selection");
		}	else if(number==2) {
			System.out.println("Customer support");
		}	else if(number==3) {
			System.out.println("Check account balance");
		}	else if(number==4) {
			System.out.println("Check loan balance");
		}	else if(number==0) {
			System.out.println("Exit");
			
		}
			
			
		}while (number!=0);
		
		

	}

}
	
	
