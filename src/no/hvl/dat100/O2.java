package no.hvl.dat100;

import java.util.Scanner;

public class O2 {
	public static void main(String[] args) {
		int i = 0;
		Scanner input1 = new Scanner(System.in);
		while (i < 10) {

			System.out.print("Gi poengsum: ");
			int Poeng = input1.nextInt();

			String Karakter = "";

			if (Poeng >= 0 && Poeng <= 39) {
				Karakter = "F";
			}  if (Poeng >= 40 && Poeng <= 49) {
				Karakter = "E";
			}  if (Poeng >= 50 && Poeng <= 59) {
				Karakter = "D";
			}  if (Poeng >= 60 && Poeng <= 79) {
				Karakter = "C";
			}  if (Poeng >= 80 && Poeng <= 89) {
				Karakter = "B";
			}  if (Poeng >= 90 && Poeng <= 100) {
				Karakter = "A";
			} else {
				System.out.println("Not a valid value,give another");
				continue;
			}

			System.out.println(Karakter);
			i++;

		}
		input1.close();
	}

}
