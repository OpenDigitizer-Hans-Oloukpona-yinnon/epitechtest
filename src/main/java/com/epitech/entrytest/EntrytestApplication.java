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
		int myrows = 14;
		int espaceMidle = 5;
		String lineString = "";
		System.out.println("\nThe star pattern is... ");
		for (int n = 1; n <= espaceMidle; n++) {
			
			for (int m = 1; m <= myrows; m++) {
				lineString = lineString + "_";
			}
			lineString = lineString + "*";
			//int t = n;
			for (int t = 1; t <= n; t++) {
				lineString = lineString + "_";
			}

			/*for (int t = 1; t <= n; t++) {
				lineString = lineString + "_";
			}*/
			//lineString = lineString + "_";
			
			
			System.out.println(lineString);
			lineString = "";
			myrows = myrows - 1;
		}
		
		lineString = "";
		
		for (int m = 0; m <= myrows + 1; m++) {
			
			lineString = lineString + "*";
		}
		
		System.out.println(lineString);
		
		
		
		
		
		/*for (int n = 1; n <= m; n++) {
				System.out.print(" ");
				System.out.print("*");
			}*/
	}

}
