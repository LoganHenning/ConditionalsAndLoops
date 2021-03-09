package sololearnLoops;

import java.util.Scanner;

public class WhileLoops {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int number = read.nextInt();
		/*prints all numbers from 1 to the inputted
		 * number that are either a multiplier of 3
		 * or end with 3
		 */
		int i = 1;
		while (i<=number) {
			if (i%3==0 || i%10==3) {
				System.out.println(i);
			}
			i++;
			}
		}

	}


