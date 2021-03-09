package sololearnLoops;

import java.util.Scanner;

public class forLoops {

	public static void main(String[] args) {
		
		/*Game that deals 7 cards representing players'
		 * roles.  5 are good guys and 2 are bad guys.
		 * Program takes the bad guys' numbers as input and
		 * output all the roles accordingly.
		 */
		Scanner read = new Scanner(System.in);
				int firstBadGuy = read.nextInt();
				int secondBadGuy = read.nextInt();
				
				for(int i=1; i<=7; i++) {
					if(i==firstBadGuy) {
						System.out.println("Bad guy");
						
					}
					else if(i==secondBadGuy) {
						System.out.println("Bad guy");
					}
					else 
						System.out.println("Good guy");
					
					
				}

	}

}
