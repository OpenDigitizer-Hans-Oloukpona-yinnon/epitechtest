package com.epitech.entrytest;

import java.util.Iterator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EntrytestApplication {

	public static void main(String[] args) {
		SpringApplication.run(EntrytestApplication.class, args);

		// Scanner scanner = new Scanner(System.in);
		// System.out.println("Please provide number of rows to print... ");
		// int myrows = scanner.nextInt();
		int myrows = 30;
		int espaceMidle = 5;
		String lineString = "";

		for (int z = 0; z <= 4; z++) {

			for (int n = 0; n <= myrows; n++) {

				int kkn = myrows / 2;
				kkn = kkn - z;
				int kkp = myrows / 2;
				kkp = kkp + z;

				if (n == kkp) {
					lineString = lineString + "*";
				} else if (n == kkn) {
					lineString = lineString + "*";
				} else {
					lineString = lineString + " ";
				}
				/*
				 * int x = myrows + 5 - n;
				 * 
				 * for (int m = 0; m <= x; m++) { lineString = lineString + " "; } lineString =
				 * lineString + "*"; //int t = n; /*for (int t = 1; t <= n; t++) { lineString =
				 * lineString + " "; }
				 * 
				 * for (int t = 2; t <= n; t++) { lineString = lineString + " "; }
				 */

				// lineString = lineString + "*";

			}

			System.out.println(lineString);
			lineString = "";
		}

		lineString = "";
		int kkp2 = myrows / 2;
		for (int m = 0; m <= myrows; m++) {

			if (m < kkp2 - 4) {
				lineString = lineString + "*";
			} else if (m > kkp2 + 4) {
				lineString = lineString + "*";
			} else {
				lineString = lineString + " ";
			}

		}

		System.out.println(lineString);

		int kkb = 1;
		int kkc = 29;
		for (int z = 0; z <= 4; z++) {

			lineString = "";

			for (int m = 0; m <= myrows; m++) {

				if (m == kkc) {
					lineString = lineString + "*";
				} else if (m == kkb) {
					lineString = lineString + "*";
				} else {
					lineString = lineString + " ";
				}

			}
			kkb = kkb + 1;
			kkc = kkc - 1;
			System.out.println(lineString);
		}

		kkb = kkb - 1;
		kkc = kkc + 1;

		for (int z = 0; z <= 3; z++) {

			lineString = "";

			kkb = kkb - 1;
			kkc = kkc + 1;

			for (int m = 0; m <= myrows; m++) {

				if (m == kkc) {
					lineString = lineString + "*";
				} else if (m == kkb) {
					lineString = lineString + "*";
				} else {
					lineString = lineString + " ";
				}

			}
			System.out.println(lineString);
		}

		lineString = "";
		// int kkp2 = myrows / 2;
		for (int m = 0; m <= myrows; m++) {

			if (m < kkp2 - 4) {
				lineString = lineString + "*";
			} else if (m > kkp2 + 4) {
				lineString = lineString + "*";
			} else {
				lineString = lineString + " ";
			}

		}

		System.out.println(lineString);

		lineString = "";

		for (int z = 4; z >= 0; z--) {

			for (int n = 0; n <= myrows; n++) {

				int kkn = myrows / 2;
				kkn = kkn - z;
				int kkp = myrows / 2;
				kkp = kkp + z;

				if (n == kkp) {
					lineString = lineString + "*";
				} else if (n == kkn) {
					lineString = lineString + "*";
				} else {
					lineString = lineString + " ";
				}

			}

			System.out.println(lineString);
			lineString = "";
		}
	}
}
