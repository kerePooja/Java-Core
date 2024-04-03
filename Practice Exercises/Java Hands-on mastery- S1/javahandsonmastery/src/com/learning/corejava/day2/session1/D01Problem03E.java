package com.learning.corejava.day2.session1;

import java.util.Scanner;

public class D01Problem03E {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number to find its factorial: ");
	        int number = scanner.nextInt();

	        int factorial = 1;

	        if (number < 0) {
	            System.out.println("Factorial is not defined for negative numbers.");
	        } else {
	            for (int i = 1; i <= number; i++) {
	                factorial *= i;
	            }
	            System.out.println("Factorial of " + number + " is " + factorial);
	        }
	    }
	}

