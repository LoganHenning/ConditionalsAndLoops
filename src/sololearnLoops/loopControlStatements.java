package sololearnLoops;

import java.util.Scanner;

public class loopControlStatements {

	public static void main(String[] args) {
		/*Takes N numbers as input and outputs
		 * the numbers from N to 0, skipping 
		 * the ones that are multiple of 3.
		 */
		Scanner read = new Scanner(System.in);
		int number = read.nextInt();
		
		for(int n = number; n>0; n--) {
			if(n%3==0) {
				continue;
			}
		System.out.println(n);
	}

}
}