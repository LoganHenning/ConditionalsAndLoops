package sololearnLoops;

import java.util.Scanner;

public class loanCalculator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int amount = scanner.nextInt();
		for(int i = 1; i<=6; i++) {
			amount = amount * 9/10;
		}
		System.out.println(amount);

	}

}
