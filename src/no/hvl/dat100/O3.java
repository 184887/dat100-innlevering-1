package no.hvl.dat100;

import java.util.Scanner;

public class O3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 0;

		while (true) {
			System.out.println("Gi et positivt heltall");
			if (input.hasNextInt()) {
				n = input.nextInt();
				if (n > 0) {
					break;
				} else {
					System.out.println("Tallet skal være større den 0");
				}
			} else {
				System.out.println("Ugyldig.");
				input.next();
			}
		}

		int fakultet = 1;
		for (int i = 1; i <= n; i++) {
			fakultet = fakultet * i;
			

		}
		System.out.println("Fakultetet av " + n + " er: " + fakultet);
		input.close();
	}
}
