package no.hvl.dat100;

import java.util.Scanner;

public class O1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Gi Intekt: ");
		float intekkt = input.nextFloat();

		float trinn1 = 0.017f;
		float trinn2 = 0.04f;
		float trinn3 = 0.136f;
		float trinn4 = 0.166f;
		float trinn5 = 0.176f;

		float skatt = 0.00f;
		
		float maxSkatt1 = 84799 * trinn1;
		float maxSkatt2 = maxSkatt1 + (377149 * trinn2);
		float maxSkatt3 = maxSkatt2 +(267899 * trinn3);
		float maxSkatt4 = maxSkatt3 +(412099 * trinn4);
		

		if (intekkt >= 0 && intekkt <= 208050) {
			System.out.println("Du trenger ikke betale trinnsaktt");
		} else if (intekkt >= 208051 && intekkt <= 292850) {
			skatt = (intekkt-208050) * trinn1;
		} else if (intekkt >= 292851 && intekkt <= 670000) {
			skatt = maxSkatt1 + ((intekkt-292850)* trinn2);
		} else if (intekkt >= 670001 && intekkt <= 937900) {
			skatt = maxSkatt2 + ((intekkt-670000)* trinn3);
		} else if (intekkt >= 937901 && intekkt <= 1350000) {
			skatt = maxSkatt3 + ((intekkt-937900)* trinn4);
		} else if (intekkt > 1350001) {
			skatt = maxSkatt4 + ((intekkt-1350000)* trinn5);
		} else {
			System.out.print("Error");
		}

		System.out.print("Din trinskatt er på " + skatt + "kr");
		
		input.close();

	}
}
