package com.learning.corejava.day2.session1;

import java.util.Scanner;

public class D01Problem03A {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number between 1 to 12: ");
	        int monthNumber = scanner.nextInt();

	        String monthName = "";

	        switch (monthNumber) {
	            case 1:
	                monthName = "January";
	                break;
	            case 2:
	                monthName = "February";
	                break;
	            case 3:
	                monthName = "March";
	                break;
	            case 4:
	                monthName = "April";
	                break;
	            case 5:
	                monthName = "May";
	                break;
	            case 6:
	                monthName = "June";
	                break;
	            case 7:
	                monthName = "July";
	                break;
	            case 8:
	                monthName = "August";
	                break;
	            case 9:
	                monthName = "September";
	                break;
	            case 10:
	                monthName = "October";
	                break;
	            case 11:
	                monthName = "November";
	                break;
	            case 12:
	                monthName = "December";
	                break;
	            default:
	                System.out.println("Invalid Input");
	                return;
	        }

	        System.out.println(monthName);
	    }
	}



